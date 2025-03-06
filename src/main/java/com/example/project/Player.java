package com.example.project;
import java.util.ArrayList;


public class Player{
    private ArrayList<Card> hand;
    private ArrayList<Card> allCards; //the current community cards + hand
    String[] suits  = Utility.getSuits();
    String[] ranks = Utility.getRanks();
    
    public Player(){
        hand = new ArrayList<>();
    }

    public ArrayList<Card> getHand(){return hand;}
    public ArrayList<Card> getAllCards(){return allCards;}

    public void addCard(Card c){ // adds a card
        hand.add(c);
    }

    public String playHand(ArrayList<Card> communityCards){   // checks what hand it is based on the cards
        allCards = new ArrayList<Card>(); 
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        for (int c = 0; c < communityCards.size(); c++) {
            allCards.add(communityCards.get(c));
            list.add(Utility.getRankValue(communityCards.get(c).getRank()));
        }
        for (int c = 0; c < getHand().size(); c++) {
            allCards.add(getHand().get(c));
        }
        sortAllCards();
        ArrayList<Integer> rFreq = findRankingFrequency();
        ArrayList<Integer> sFreq = findSuitFrequency();
        Boolean straightCheck = true;
        for (int c = 1; c < allCards.size(); c++) {
            if (Utility.getRankValue(allCards.get(c - 1).getRank()) + 1 != Utility.getRankValue(allCards.get(c).getRank())) {
                straightCheck = false;
            }
        }
        if (isInList(4, rFreq)) {
            return "Four of a Kind";
        } else if (isInList(5, sFreq)) {
            if (straightCheck) {
                if (allCards.get(0).getRank() == "10") {
                    return "Royal Flush";
                } else {
                    return "Straight Flush";
                }
            } else {
                return "Flush";
            }
        } else if (straightCheck) {
            return "Straight";
        } else if (isInList(3, rFreq)) {
            if (isInList(2, rFreq)) {
                return "Full House";
            } else {
                return "Three of a Kind";
            }
        } else if (isInList(2, rFreq)) {
            rFreq.remove(rFreq.indexOf(2));
            if (isInList(2, rFreq)) {
                return "Two Pair";
            } else {
                return "A Pair";
            }
        } else if (isInList(Utility.getRankValue(allCards.get(4).getRank()), list)) {
            return "Nothing";
        }
        System.out.println(list);
        return "High Card"; 
    }

    public void sortAllCards(){ // sorts cards based on ranking with insertion
        ArrayList<Card> cards = getAllCards();
        for (int c = 1; c < cards.size(); c++) {
            int count = c;
            while (count != 0 && Utility.getRankValue(cards.get(count - 1).getRank()) > Utility.getRankValue(cards.get(count).getRank())) {
                cards.add(count - 1, cards.remove(count));
                count--;
            }
        }
        allCards = cards;
    } 

    public ArrayList<Integer> findRankingFrequency(){ //Counts the number of times a rank appears and returns a list
        ArrayList<Integer> rFreq = new ArrayList<>();
        for (int c = 0; c < Utility.getRanks().length; c++) {
            rFreq.add(0);
        }
        for (int c = 0; c < allCards.size(); c++){
            for (int d = 0; d < Utility.getRanks().length; d++) {
                if (allCards.get(c).getRank().equals(Utility.getRanks()[d])) {
                    rFreq.add(d, rFreq.remove(d) + 1);
                } 
            }
        }
        return rFreq; 
    }

    public ArrayList<Integer> findSuitFrequency(){ //Counts the number of times a suit appears and returns a list
        ArrayList<Integer> sFreq = new ArrayList<>();
        for (int c = 0; c < Utility.getSuits().length; c++) {
            sFreq.add(0);
        }
        for (int c = 0; c < allCards.size(); c++){
            for (int d = 0; d < Utility.getSuits().length; d++) {
                if (allCards.get(c).getSuit().equals(Utility.getSuits()[d])) {
                    sFreq.add(d, sFreq.remove(d) + 1);
                } 
            }
        }
        return sFreq; 
    }

        private boolean isInList (int num, ArrayList<Integer> list) { // this is the contains method replacement
            for (int c : list) {
                if (c == num) {
                    return true;
                }
            }
            return false;
        }
    @Override
    public String toString(){
        return hand.toString();
    }




}
