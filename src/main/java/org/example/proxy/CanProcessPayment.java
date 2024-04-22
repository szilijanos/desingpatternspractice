package org.example.proxy;

import java.util.Optional;

public interface CanProcessPayment {
    Optional<String> transferAmount(double amount, String account, String token);
}
