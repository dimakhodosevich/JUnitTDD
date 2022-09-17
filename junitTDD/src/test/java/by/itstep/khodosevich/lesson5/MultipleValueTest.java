package by.itstep.khodosevich.lesson5;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MultipleValueTest extends TestCase {
    private int firstNumber;
    private int secondNumber;
    private int result;
    MultipleValue multipleValue;

    public MultipleValueTest(int firstNumber, int secondNumber, int result) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.result = result;
    }

    @Before
    public void before(){
        multipleValue = new MultipleValue();
    }


    @Parameterized.Parameters
    public static Collection multipleNumber(){
        return Arrays.asList(new Object[][]{
                {2,2,4},
                {3,3,9},
                {5,5,25},
        });
    }

    @Test
    public void multipleTest(){
        System.out.println("First number " + firstNumber + " Second number " + secondNumber +
                " Result = "  + result);
        assertEquals(result, multipleValue.multiple(firstNumber, secondNumber));

    }

}