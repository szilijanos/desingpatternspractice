package org.example.proxy;

import java.util.Optional;

public class PaymentProcessorProxy implements CanProcessPayment {
    private final CanAuth authenticator;
    private final CanProcessPayment paymentProcessor;

    public PaymentProcessorProxy(final CanAuth auth, final CanProcessPayment paymentProcessor) {
        this.authenticator = auth;
        this.paymentProcessor = paymentProcessor;
    }

    @Override
    public Optional<String> transferAmount(double amount, final String account, final String token) {
        if (this.authenticator.authenticate(token).isPresent()) {
            return this.paymentProcessor.transferAmount(amount, account, token);
        }

        return Optional.empty();
    }
}
