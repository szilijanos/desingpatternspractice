package org.example.decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DecoratorTest {

    @Test
    public void testIfCoreObjectCreated() {
        final HelloGreeterUtility utility = new HelloGreeterUtility();

        Assertions.assertNotNull(utility);
    }

    @Test
    public void testBaseHelloFunctionality() {
        final HelloGreeterUtility greeter = new HelloGreeterUtility();
        final String expected = "hello";

        final String actual = greeter.sayHello();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGreetingWithName() {
        final CanSayHello greeter = new GreetWithNameDecorator(new HelloGreeterUtility(), "Fred");
        final String expected = "hello, Fred";

        final String actual = greeter.sayHello();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGreetingWithNameAndExclamation() {
        final CanSayHello greeter = new GreetWithExlamationDecorator(new GreetWithNameDecorator(new HelloGreeterUtility(), "Fred"));
        final String expected = "hello, Fred!";

        final String actual = greeter.sayHello();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGreetingWithExclamation() {
        final CanSayHello greeter = new GreetWithExlamationDecorator((new HelloGreeterUtility()));
        final String expected = "hello!";

        final String actual = greeter.sayHello();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGreetingWithNameLastAndExclamationFirst() {
        final CanSayHello greeter = new GreetWithNameDecorator(new GreetWithExlamationDecorator((new HelloGreeterUtility())), "Joe");
        final String expected = "hello!, Joe";

        final String actual = greeter.sayHello();

        Assertions.assertEquals(expected, actual);
    }
}
