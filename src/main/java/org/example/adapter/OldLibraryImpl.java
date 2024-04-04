package org.example.adapter;

public class OldLibraryImpl implements OldLib {
    @Override
    public void doSomethingOld(String param1) {
        System.out.println("adapter.OldLibraryImpl.doSomethingOld, param1 = " + param1);
    }
}
