package org.example.proxy;

import java.util.Optional;

public class PaymentProcessor implements CanProcessPayment {
    private String transferAmount(double amount, final String account) {
        return "Now I transfer " + amount + " to " + account + ".";
    }

    @Override
    public Optional<String> transferAmount(double amount, final String account, final String token) {
        return Optional.of(transferAmount(amount, account));
    }
}
