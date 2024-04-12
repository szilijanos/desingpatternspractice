package org.example.decorator;

public class GreetWithNameDecorator extends AbstractHelloGreeterDecorator {
    final String name;

    public GreetWithNameDecorator(CanSayHello helloGreeterUtility, final String name) {
        super(helloGreeterUtility);
        this.name = name;
    }

    @Override
    public String sayHello() {
        return helloGreeterUtility.sayHello() + ", " + this.name;
    }
}
