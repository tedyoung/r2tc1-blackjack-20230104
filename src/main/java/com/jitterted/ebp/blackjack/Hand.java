package com.jitterted.ebp.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private final List<Card> cards = new ArrayList<Card>();

    @Deprecated
    public List<Card> getCards() {
        return cards;
    }

    void drawCardFrom(Deck deck) {
        getCards().add(deck.draw());
    }
}