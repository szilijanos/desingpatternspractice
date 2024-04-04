package org.example.adapter;

public class OldLibAdapter implements NewLib {

    private final OldLib old;
    public OldLibAdapter(final OldLib oldLibInstance) {
        this.old = oldLibInstance;
    }

    @Override
    public void doSomethingNew(String param1, String param2) {
        this.old.doSomethingOld("let's concat new params: " + param1 + ", " + param2);
    }
}
