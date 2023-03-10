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

    @Test
    public void addMoneyOf10ThenBalanceIs10() throws Exception {
        // GIVEN/SETUP/ARRANGE
        Wallet wallet = new Wallet();

        // execute COMMAND
        wallet.addMoney(10);

        // assert against QUERY
        assertThat(wallet.balance())
                .isEqualTo(10);
    }

    @Test
    public void addMoney7And8ThenBalanceIs15() throws Exception {
        Wallet wallet = new Wallet();

        wallet.addMoney(7);
        wallet.addMoney(8);

        assertThat(wallet.balance())
                .isEqualTo(7 + 8);
    }

    @Test
    public void addNegativeMoneyThrowsException() throws Exception {
        Wallet wallet = new Wallet();

        assertThatThrownBy(() -> {
            wallet.addMoney(-1);
        })
          .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void addZeroMoneyThrowsException() throws Exception {
        Wallet wallet = new Wallet();

        assertThatThrownBy(() -> {
            wallet.addMoney(0);
        })
          .isInstanceOf(IllegalArgumentException.class);
    }




}


