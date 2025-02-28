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

    public void addCard(Card c){
        hand.add(c);
    }

    public String playHand(ArrayList<Card> communityCards){      
        return "Nothing";
    }

    public void SortCards(){
        ArrayList<Card> cards = getAllCards();
        for (int c = 1; c < cards.size(); c++) {
            int count = c;
            while (Utility.getRankValue(cards.get(count - 1).getRank()) > Utility.getRankValue(cards.get(count).getRank()) && count != 0) {
                cards.add(count - 1, cards.remove(count));
                count--;
            }
        }
        allCards = cards;
    } 

    public ArrayList<Integer> findRankingFrequency(){
        ArrayList<Integer> rFreq = new ArrayList<>();
        String [] ranks = Utility.getRanks();
        for (int c = 0; c < ranks.length; c++){
            for (int d = 0; d < allCards.size(); d++) {
                if (allCards.get(d).)
            }
        }
        return rFreq; 
    }

    public ArrayList<Integer> findSuitFrequency(){
        return new ArrayList<>(); 
    }

   
    @Override
    public String toString(){
        return hand.toString();
    }




}
