package org.example.facade;

public class MyFacadeImplementation implements CanDoThisAndThatFacade
{
    private final DoublingService doublingService;
    private final FooService printingService;

    public MyFacadeImplementation() {
        doublingService = new DoublingService();
        printingService = new FooService();
    }

    @Override
    public String doThis(int withThisInteger) {
        return doublingService.doubleThis(withThisInteger) + "";
    }

    @Override
    public String doThat(String withThisString, int withThisInteger) throws IllegalArgumentException {
        return printingService.printStringANumberOfTimes(doublingService.doubleThis(withThisInteger), withThisString);
    }

    public String doThat(int withThisInteger) throws IllegalArgumentException {
        return doThat("*", withThisInteger);
    }
}
