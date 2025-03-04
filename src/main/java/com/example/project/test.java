package com.example.project;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        Player play = new Player();
        play.addCard(new Card("7", "♠"));
        play.addCard(new Card("K", "♠"));
        ArrayList<Card> communityCards = new ArrayList<>();
        communityCards.add(new Card("7", "♦"));
        communityCards.add(new Card("8", "♠"));
        communityCards.add(new Card("A", "♣"));
        System.out.println(play.playHand(communityCards));
    }
}
