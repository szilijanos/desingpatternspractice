package org.example.facade;

public class FooService implements CanPrintAStringANumberOfTimes {
    @Override
    public String printStringANumberOfTimes(int n, String str) throws IllegalArgumentException {
        return str.repeat(n);
    }
}
