package com.example.project;
import java.util.ArrayList;
import java.util.Scanner;


public class Game{
    public static String determineWinner(Player p1, Player p2,String p1Hand, String p2Hand,ArrayList<Card> communityCards){
        if (Utility.getHandRanking(p1.playHand(communityCards)) > Utility.getHandRanking(p2.playHand(communityCards))) {
            return "Player 1 wins!";
        } else if (Utility.getHandRanking(p1.playHand(communityCards)) < Utility.getHandRanking(p2.playHand(communityCards))) {
            return "Player 2 wins!";
        }
        if (Utility.getHandRanking(p1.playHand(communityCards)) == 10 || Utility.getHandRanking(p1.playHand(communityCards)) == 6) {
            int x = 0;
            int y = 0;
            for (int c = 0; c < p1.findRankingFrequency().size(); c++) {
                if (p1.findRankingFrequency().get(c) == 1) {
                    x = c;
                }
            }
            for (int c = 0; c < p2.findRankingFrequency().size(); c++) {
                if (p2.findRankingFrequency().get(c) == 1) {
                    y = c;
                }
            }
            if (x > y) {
                return "Player 1 wins!";
            } else if (y > x) {
                return "Player 2 wins!";
            } else {
                return "Tie!";
            }
        }
        if (Utility.getHandRanking(p1.playHand(communityCards)) == 9) {
            int x = 0;
            int y = 0;
            for (int c = 0; c < p1.findRankingFrequency().size(); c++) {
                if (p1.findRankingFrequency().get(c) == 4) {
                    x = c;
                }
            }
            for (int c = 0; c < p2.findRankingFrequency().size(); c++) {
                if (p2.findRankingFrequency().get(c) == 4) {
                    y = c;
                }
            }
            if (x > y) {
                return "Player 1 wins!";
            } else if (y > x) {
                return "Player 2 wins!";
            } else {
                for (int c = 0; c < p1.findRankingFrequency().size(); c++) {
                    if (p1.findRankingFrequency().get(c) == 1) {
                        x = c;
                    }
                }
                for (int c = 0; c < p2.findRankingFrequency().size(); c++) {
                    if (p2.findRankingFrequency().get(c) == 1) {
                        y = c;
                    }
                }
                if (x > y) {
                    return "Player 1 wins!";
                } else if (y > x) {
                    return "Player 2 wins!";
                } else {
                    return "Tie!";
                }
            }
        } 
        if (Utility.getHandRanking(p1.playHand(communityCards)) == 8) {
            int x = 0;
            int y = 0;
            for (int c = 0; c < p1.findRankingFrequency().size(); c++) {
                if (p1.findRankingFrequency().get(c) == 3) {
                    x = c;
                }
            }
            for (int c = 0; c < p2.findRankingFrequency().size(); c++) {
                if (p2.findRankingFrequency().get(c) == 3) {
                    y = c;
                }
            }
            if (x > y) {
                return "Player 1 wins!";
            } else if (y > x) {
                return "Player 2 wins!";
            } else {
                for (int c = 0; c < p1.findRankingFrequency().size(); c++) {
                    if (p1.findRankingFrequency().get(c) == 2) {
                        x = c;
                    }
                }
                for (int c = 0; c < p2.findRankingFrequency().size(); c++) {
                    if (p2.findRankingFrequency().get(c) == 2) {
                        y = c;
                    }
                }
                if (x > y) {
                    return "Player 1 wins!";
                } else if (y > x) {
                    return "Player 2 wins!";
                } else {
                    return "Tie!";
                }
            }
        } 
        if (Utility.getHandRanking(p1.playHand(communityCards)) == 7) {
            int x = 0;
            int y = 0;
            for (int c = 0; c < p1.findRankingFrequency().size(); c++) {
                if (p1.findRankingFrequency().get(c) != 0) {
                    x = c;
                }
            }
            for (int c = 0; c < p2.findRankingFrequency().size(); c++) {
                if (p2.findRankingFrequency().get(c) != 0) {
                    y = c;
                }
            }
            if (x > y) {
                return "Player 1 wins!";
            } else if (y > x) {
                return "Player 2 wins!";
            } else {
                return "Tie!";
            }
        }
        if (Utility.getHandRanking(p1.playHand(communityCards)) == 5) {
            int x = 0;
            int y = 0;
            for (int c = 0; c < p1.findRankingFrequency().size(); c++) {
                if (p1.findRankingFrequency().get(c) == 3) {
                    x = c;
                }
            }
            for (int c = 0; c < p2.findRankingFrequency().size(); c++) {
                if (p2.findRankingFrequency().get(c) == 3) {
                    y = c;
                }
            }
            if (x > y) {
                return "Player 1 wins!";
            } else if (y > x) {
                return "Player 2 wins!";
            } else {
                for (int c = 0; c < p1.findRankingFrequency().size(); c++) {
                    if (p1.findRankingFrequency().get(c) != 0 && p1.findRankingFrequency().get(c) != 3) {
                        x = c;
                    }
                }
                for (int c = 0; c < p2.findRankingFrequency().size(); c++) {
                    if (p2.findRankingFrequency().get(c) != 0 && p2.findRankingFrequency().get(c) != 3) {
                        y = c;
                    }
                }
                if (x > y) {
                    return "Player 1 wins!";
                } else if (y > x) {
                    return "Player 2 wins!";
                } else {
                    return "Tie!";
                }
            }
        } 
        if (Utility.getHandRanking(p1.playHand(communityCards)) == 5) {
            int x = 0;
            int y = 0;
            for (int c = 0; c < p1.findRankingFrequency().size(); c++) {
                if (p1.findRankingFrequency().get(c) == 3) {
                    x = c;
                }
            }
            for (int c = 0; c < p2.findRankingFrequency().size(); c++) {
                if (p2.findRankingFrequency().get(c) == 3) {
                    y = c;
                }
            }
            if (x > y) {
                return "Player 1 wins!";
            } else if (y > x) {
                return "Player 2 wins!";
            } else {
                for (int c = 0; c < p1.findRankingFrequency().size(); c++) {
                    if (p1.findRankingFrequency().get(c) != 0 && p1.findRankingFrequency().get(c) != 3) {
                        x = c;
                    }
                }
                for (int c = 0; c < p2.findRankingFrequency().size(); c++) {
                    if (p2.findRankingFrequency().get(c) != 0 && p2.findRankingFrequency().get(c) != 3) {
                        y = c;
                    }
                }
                if (x > y) {
                    return "Player 1 wins!";
                } else if (y > x) {
                    return "Player 2 wins!";
                } else {
                    return "Tie!";
                }
            }
        } 
        if (Utility.getHandRanking(p1.playHand(communityCards)) == 4) {
            int x = 0;
            int y = 0;
            for (int c = 0; c < p1.findRankingFrequency().size(); c++) {
                if (p1.findRankingFrequency().get(c) == 2) {
                    x = c;
                }
            }
            for (int c = 0; c < p2.findRankingFrequency().size(); c++) {
                if (p2.findRankingFrequency().get(c) == 2) {
                    y = c;
                }
            }
            if (x > y) {
                return "Player 1 wins!";
            } else if (y > x) {
                return "Player 2 wins!";
            } else {
                for (int c = p1.findRankingFrequency().size() - 1; c > 0; c--) {
                    if (p1.findRankingFrequency().get(c) == 2) {
                        x = c;
                    }
                }
                for (int c = p2.findRankingFrequency().size() - 1; c > 0; c--) {
                    if (p2.findRankingFrequency().get(c) == 2) {
                        y = c;
                    }
                }
                if (x > y) {
                    return "Player 1 wins!";
                } else if (y > x) {
                    return "Player 2 wins!";
                } else {
                    return "Tie!";
                }
            }
        } 
        if (Utility.getHandRanking(p1.playHand(communityCards)) == 3) {
            int x = 0;
            int y = 0;
            for (int c = 0; c < p1.findRankingFrequency().size(); c++) {
                if (p1.findRankingFrequency().get(c) == 2) {
                    x = c;
                }
            }
            for (int c = 0; c < p2.findRankingFrequency().size(); c++) {
                if (p2.findRankingFrequency().get(c) == 2) {
                    y = c;
                }
            }
            if (x > y) {
                return "Player 1 wins!";
            } else if (y > x) {
                return "Player 2 wins!";
            } else {
                return "Tie!";
            }
        } 
        if (Utility.getHandRanking(p1.playHand(communityCards)) == 2 ) {
            int x = 0;
            int y = 0;
            for (int c = 0; c < p1.findRankingFrequency().size(); c++) {
                if (p1.findRankingFrequency().get(c) == 1) {
                    x = c;
                }
            }
            for (int c = 0; c < p2.findRankingFrequency().size(); c++) {
                if (p2.findRankingFrequency().get(c) == 1) {
                    y = c;
                }
            }
            if (x > y) {
                return "Player 1 wins!";
            } else if (y > x) {
                return "Player 2 wins!";
            } else {
                return "Tie!";
            }
        } 
        if (Utility.getHandRanking(p1.playHand(communityCards)) == 1) {
            int x = 0;
            int y = 0;
            for (int c = 0; c < p1.getHand().size(); c++) {
                if (Utility.getRankValue(p1.getHand().get(c).getRank()) > x) {
                    x = Utility.getRankValue(p1.getHand().get(c).getRank());
                }
            }
            for (int c = 0; c < p2.getHand().size(); c++) {
                if (Utility.getRankValue(p2.getHand().get(c).getRank()) > y) {
                    y = Utility.getRankValue(p2.getHand().get(c).getRank());
                }
            }
            if (x > y) {
                return "Player 1 wins!";
            } else if (y > x) {
                return "Player 2 wins!";
            } else {
                return "Tie!";
            }
        } 
        return "Tie!";
    }

    public static void play(){ //simulate card playing
        int money = 1000;
        Scanner scan = new Scanner(System.in);
        String ans = "";
        Deck deck = new Deck();
        deck.initializeDeck();  
        deck.shuffleDeck();
        ArrayList<Card> community = new ArrayList<Card>();
        while (!ans.equals("No") && money > 0) {
            Player p1 = new Player();
            Player p2 = new Player();
            p1.addCard(deck.drawCard());
            p1.addCard(deck.drawCard());
            p2.addCard(deck.drawCard());
            p2.addCard(deck.drawCard());
            community.add(deck.drawCard());
            community.add(deck.drawCard());
            community.add(deck.drawCard());
            String p1hand = p1.playHand(community);
            String p2hand = p2.playHand(community);
            System.out.println("\nAmount of money remaining: $" + money);
            System.err.println("\nYour hand:\n" + p1.getHand().get(0).toString() + " and " + p1.getHand().get(1).toString());
            System.err.println("Community Cards:\n" + community.get(0).toString() + ", " + community.get(1).toString() + ", and " + community.get(2).toString());
            System.out.println("\nHow much do you want to bet?");
            int bet = scan.nextInt();
            String results = determineWinner(p1, p2, p1hand, p2hand, community);
            if (results.equals("Player 1 wins!")) {
                money += bet;
                System.out.println("You won " + bet + " dollars!");
            } else if (results.equals("Player 2 wins!")) {
                money -= bet;
                System.out.println("You lost " + bet + " dollars!");
            } else {
                System.out.println("It's a tie!");
            }
            System.out.println("\nOpponent's hand:\n" + p2.getHand().get(0).toString() + " and " + p2.getHand().get(1).toString());
            System.out.println("\nDo you wish to keep playing?");
            scan.nextLine();
            ans = scan.nextLine();
        }
        if (money == 0) {
            System.out.println("Well you can't because your out of money");
        } else if (money < 0) {
            System.out.println("Well you can't since you bet more than you have and lost");
        }
    }
        
    public static void main(String[] args) {
        play();
    }

}