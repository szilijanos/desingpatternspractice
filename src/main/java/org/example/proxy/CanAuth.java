package org.example.proxy;

import java.util.Optional;

public interface CanAuth {
    Optional<String> authenticate(final String token);
}
