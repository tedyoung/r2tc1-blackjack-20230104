package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class WalletTest {

    @Test
    void newWalletIsEmpty() throws Exception {
        Wallet wallet = new Wallet();

        assertThat(wallet.isEmpty())
                .isTrue();
    }

    @Test
    public void newWalletAddMoneyIsNotEmpty() throws Exception {
        Wallet wallet = new Wallet();

        wallet.addMoney(1);

        assertThat(wallet.isEmpty())
                .isFalse();
    }

    @Test
    public void newWalletBalanceIsZero() throws Exception {
        Wallet wallet = new Wallet();

        assertThat(wallet.balance())
                .isZero();
    }


}
