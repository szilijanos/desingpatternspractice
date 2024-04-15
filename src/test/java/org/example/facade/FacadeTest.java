package org.example.facade;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FacadeTest {
    @Test
    public void testCanCreateFacade() {
        final CanDoThisAndThatFacade thisAndThatFacade = new MyFacadeImplementation();

        Assertions.assertNotNull(thisAndThatFacade);
    }

    @Test
    public void testDoThisUsesPrintsTheDoubleIfANumberAsString() {
        final CanDoThisAndThatFacade thisAndThatFacade = new MyFacadeImplementation();
        final String expected = "6";

        final String actual = thisAndThatFacade.doThis(3);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDoThatPrintsTheDoubleNumberOfDefaultCharactersAsString() {
        final CanDoThisAndThatFacade thisAndThatFacade = new MyFacadeImplementation();
        final String expected = "********";

        final String actual = thisAndThatFacade.doThat(4);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDoThatPrintsTheDoubleNumberOfGivenCharactersAsString() {
        final CanDoThisAndThatFacade thisAndThatFacade = new MyFacadeImplementation();
        final String expected = ";;;;;;;;";

        final String actual = thisAndThatFacade.doThat(";", 4);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDoThatThrowsIfNegativeNumberIsGiven() {
        final CanDoThisAndThatFacade thisAndThatFacade = new MyFacadeImplementation();

        final Exception e = Assertions.assertThrowsExactly(
                IllegalArgumentException.class,
                () -> thisAndThatFacade.doThat(-1)
        );
        Assertions.assertEquals("count is negative: -2", e.getMessage());
    }
}
