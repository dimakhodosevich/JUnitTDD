package by.itstep.khodosevich.lesson2;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class NameTest {

    @Test
    public void isAdult_AgeLessThan18_False(){
        boolean result = Name.isAdult(17);
        assertFalse(result);
    }

    @Test
    public void isAdult_False_AgeLessThan18(){
        boolean result = Name.isAdult(17);
        assertFalse(result);
    }

    @Test
    public void testIsNotAdultItIfAgeLessThan18(){
        boolean result = Name.isAdult(17);
        assertFalse(result);
    }

    @Test
    public void isNotAnAdultIfAgeLessThan18(){
        boolean result = Name.isAdult(17);
        assertFalse(result);
    }

    @Test
    public void should_ReturnFalse_When_ageLessThan18(){
        boolean result = Name.isAdult(17);
        assertFalse(result);
    }

    @Test
    public void when_AgeLessThan18_Expected_isAdultAsFalse(){
        boolean result = Name.isAdult(17);
        assertFalse(result);
    }

    @Test
    public void given_TreToByACigatette_When_AgeLessThan18_Expected_IsAdultAsFalse(){
        boolean result = Name.isAdult(17);
        assertFalse(result);
    }
}