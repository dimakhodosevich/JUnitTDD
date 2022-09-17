package by.itstep.khodosevich.lesson5;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest extends TestCase {
    private int inputValue;
    private boolean resultValue;
    private PrimeNumberChecker numberChecker;

    public PrimeNumberCheckerTest(int inputValue, boolean resultValue) {
        this.inputValue = inputValue;
        this.resultValue = resultValue;
    }

    @Before
    public void init(){
        numberChecker = new PrimeNumberChecker();
    }

    @Parameterized.Parameters
    public static Collection primeNumber() {
        return Arrays.asList(new Object[][]{
                {2, true},
                {6, false},
                {19, true},
                {22, false},
                {23, true}
        });
    }

    @Test
    public void testPrimeNumber() {
        System.out.println("Parametrized number is " + inputValue);
        assertEquals(resultValue, numberChecker.validate(inputValue));
    }
}