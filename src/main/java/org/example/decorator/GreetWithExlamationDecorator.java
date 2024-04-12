package org.example.decorator;

public class GreetWithExlamationDecorator extends AbstractHelloGreeterDecorator {
    public GreetWithExlamationDecorator(CanSayHello helloGreeterUtility) {
        super(helloGreeterUtility);
    }

    @Override
    public String sayHello() {
        return helloGreeterUtility.sayHello() + "!";
    }
}
