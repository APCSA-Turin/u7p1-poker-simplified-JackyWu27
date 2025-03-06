package com.example.project;
import java.util.ArrayList;


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
    
    }
        
        

}