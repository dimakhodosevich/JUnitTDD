package by.itstep.khodosevich.lesson1;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberTest {

    @org.junit.Test
    public void sum() {
        int actual = Number.sum(5);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    public void multiple() {
        int actual = Number.multiple(5,5);
        int expected = 25;
        assertEquals(expected, actual);
    }
}