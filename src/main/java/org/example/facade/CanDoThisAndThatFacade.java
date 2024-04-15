package org.example.facade;

public interface CanDoThisAndThatFacade {
    public String doThis(final int withThisInteger);
    public String doThat(final String withThisString, final int withThisInteger);
    public String doThat(int withThisInteger);
}
