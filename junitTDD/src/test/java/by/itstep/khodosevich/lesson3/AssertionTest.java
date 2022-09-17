package by.itstep.khodosevich.lesson3;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AssertionTest {

    @Test
    public void whenAssertionEquality_thenEqual() {
        String actual = "ITVDN";
        String expected = "ITVDN";
        String message = "Expected and actual not equal!!!";

        assertEquals(message, expected, actual);
    }

    @Test
    public void whenAssertionDoubleEquality_thenEqual() {
        double actual = 0.34;
        double expected = 0.33;
        double delta = 0.1;
        String message = "Expected and actual not equal and more then" + delta;

        assertEquals(message, expected, actual, delta);
    }

    @Test
    public void whenAssertionArrayEquality_thenEqual() {
        char[] actual = {'D', 'i', 'm', 'a'};
        char[] expected = {'D', 'i', 'm', 'a'};

        String message = "Expected and actual not equal!!!";

        assertArrayEquals(message, expected, actual);
    }


    @Test
    public void givenNullArray_whenAssertionArrayEquality_thenEqual() {
        char[] actual = null;
        char[] expected = null;

        String message = "Expected and actual not equal!!!";

        assertArrayEquals(message, expected, actual);
    }

    @Test
    public void whenAssertionNull_thenFalse() {
        char[] actual = null;

        String message = "Your object is null!!!";
        assertNull(message, actual);
    }


    @Test
    public void whenAssertionNotNull_thenTrue() {
        Object obj = new Object();

        String message = "Your object is null!!!";
        assertNotNull(obj);
    }

    @Test
    public void whenAssertionNotTheSameObject_thenDifferent() {
        Object obj1 = new Object();
        Object obj2 = new Object();


        String message = "Your object not the same!!!";
        assertNotSame(message, obj1, obj2);
    }

    @Test
    public void whenAssertionTheSameObject_thenNotDifferent() {
        String msg1 = "Dima";
        String msg2 = new String("Dima");


        String message = "Your object not the same!!!";
        assertNotSame(message, msg1, msg2);
    }

    @Test
    public void whenAssertionCondition_thenTrue() {

        String message = "5 less then 4";
        assertTrue(message, 5 > 4);
        assertFalse(4 > 5);
    }

    @Test
    public void whenCheckingExceptionMessage_thenEqual() {
        try {
            methodThatShouldThrowException();
            fail("Exception not throwed!!!");
        } catch (UnsupportedOperationException exception) {
            String expected = "Operation not supported!!!";
            assertEquals(expected, exception.getMessage());
        }
    }

    private void methodThatShouldThrowException() {
        throw new UnsupportedOperationException("Operation not supported!!!");
    }

    @Test
    public void testAssertThatHasItems(){
        List<String> list = Arrays.asList("java", "kotlin", "scala");
        assertThat(list, CoreMatchers.hasItem("java"));
    }





}