package org.example.proxy;

import java.util.Optional;

public class PaymentProcessorProxy implements CanProcessPayment {
    private final CanAuth authenticator;
    private final CanProcessPayment paymentTransfer;

    public PaymentProcessorProxy(final CanAuth auth, final CanProcessPayment paymentTransfer) {
        this.authenticator = auth;
        this.paymentTransfer = paymentTransfer;
    }

    @Override
    public Optional<String> transferAmount(double amount, final String account, final String token) {
        if (this.authenticator.authenticate(token).isPresent()) {
            return this.paymentTransfer.transferAmount(amount, account, token);
        }

        return Optional.empty();
    }
}
