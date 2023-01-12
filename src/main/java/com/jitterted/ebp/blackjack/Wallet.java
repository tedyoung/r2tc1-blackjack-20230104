package com.jitterted.ebp.blackjack;

public class Wallet {

    private int balance = 0;

    public Wallet() {
    }

    public boolean isEmpty() {
        return balance == 0;
    }

    public void addMoney(int amount) {
        requireAmountGreaterThanZero(amount);
        balance += amount;
    }

    private void requireAmountGreaterThanZero(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException();
        }
    }

    public int balance() {
        return balance;
    }

    public void bet(int betAmount) {
        if (betAmount > balance) {
            throw new IllegalStateException();
        }
        balance -= betAmount;
    }
}
