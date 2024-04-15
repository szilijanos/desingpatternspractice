package org.example.facade;

public class DoublingService implements CanDoubleAnInteger{
    @Override
    public int doubleThis(int number) {
        return number * 2;
    }
}
