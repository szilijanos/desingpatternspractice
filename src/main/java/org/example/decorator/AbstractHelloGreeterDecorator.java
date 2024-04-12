package org.example.decorator;

public abstract class AbstractHelloGreeterDecorator implements CanSayHello {
    final CanSayHello helloGreeterUtility;
    public AbstractHelloGreeterDecorator(CanSayHello helloGreeterUtility) {
        this.helloGreeterUtility = helloGreeterUtility;
    }

    public abstract String sayHello();
}
