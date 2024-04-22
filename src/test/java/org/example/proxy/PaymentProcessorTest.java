package org.example.proxy;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PaymentProcessorTest {

    @Test
    public void testTransfer() {
        CanProcessPayment processor = new PaymentProcessor();
        final Optional<String> actual = processor.transferAmount(10.00, "Ben", "foo");
        Assertions.assertEquals("Now I transfer 10.0 to Ben.", actual.get());
    }
}
