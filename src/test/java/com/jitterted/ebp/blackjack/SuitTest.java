package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SuitTest {

    @Test
    void heartsAreRed() throws Exception {
        assertThat(Suit.HEARTS.isRed())
                .isTrue();
    }

    @Test
    void clubsAreNotRed() throws Exception {
        assertThat(Suit.CLUBS.isRed())
                .isFalse();
    }

}