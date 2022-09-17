package by.itstep.khodosevich.lesson5;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class SumValueTest extends TestCase {
    private int firstNumber;
    private int secondNumber;
    private int resultValue;
    private SumValue sumValue;

    @Before
    public void before(){
        sumValue = new SumValue();
    }

    public SumValueTest(int firstNumber, int secondNumber, int resultValue) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.resultValue = resultValue;
    }

    @Parameterized.Parameters
    public static Collection sumNumbers(){
        return Arrays.asList(new Object[][]{
                {2,2,4},
                {3,3,6},
                {4,4,8}
        });
    }

    @Test
    public void sumTest(){
        System.out.println("First number " + firstNumber + " Second number " + secondNumber +
                " Result = "  + resultValue);
        assertEquals(resultValue, sumValue.sum(firstNumber, secondNumber));
    }


}