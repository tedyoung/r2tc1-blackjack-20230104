package com.jitterted.ebp.blackjack;

public class Wallet {

    private int balance = 0;

    public Wallet() {
    }

    public boolean isEmpty() {
        return balance == 0;
    }

    public void addMoney(int amount) {
        requireNonNegativeAmount(amount);
        balance += amount;
    }

    private void requireNonNegativeAmount(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException();
        }
    }

    public int balance() {
        return balance;
    }

}
