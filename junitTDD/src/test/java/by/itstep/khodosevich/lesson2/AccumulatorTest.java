
package by.itstep.khodosevich.lesson2;

import org.junit.*;

import static org.junit.Assert.*;

public class AccumulatorTest {
    private Accumulator accumulator = new Accumulator();
    private static int number;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
        number = 10;
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }

    @Before
    public void before() {
        accumulator = new Accumulator();
        System.out.println("Before");
    }

    @After
    public void after() {
        Accumulator accumulator = null;
        System.out.println("After");
    }

    @Test
    public void accumulate() {
        System.out.println("Accumulate");
        accumulator.accumulate(number);
        accumulator.accumulate(20);

        int actual = accumulator.getCounter();
        int expected = 30;
        assertEquals(expected, actual);
    }

    @Test
    @Ignore("Test ignore for our study!!!")
    public void getCounter() {
        System.out.println("getCounter");
        accumulator.accumulate(number);

        int actual = accumulator.getCounter();
        int expected = number;
        assertEquals(expected, actual);
    }
}