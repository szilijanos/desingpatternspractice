package org.example.proxy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.util.Optional;

public class PaymentProcessorProxyTest {
    @Test
    public void testSuccessfulAuthenticationAllowingTransaction() {
        final CanAuth authStub = mock(CanAuth.class);
        when(authStub.authenticate("fooToken")).thenReturn(Optional.of("Fred"));

        final CanProcessPayment transferPayment = new PaymentProcessorProxy(authStub, new PaymentProcessor());

        final Optional<String> actual = transferPayment.transferAmount(15.13, "Ben", "fooToken");

        Assertions.assertEquals("Now I transfer 15.13 to Ben.", actual.get());
    }

    @Test
    public void testAuthenticationFailureDenyingTransaction() {
        final CanAuth authStub = mock(CanAuth.class);
        when(authStub.authenticate("fooToken")).thenReturn(Optional.empty());

        final CanProcessPayment transferPayment = new PaymentProcessorProxy(authStub, new PaymentProcessor());

        final Optional<String> actual = transferPayment.transferAmount(15.13, "Ben", "fooToken");

        Assertions.assertTrue(actual.isEmpty());
    }
}
