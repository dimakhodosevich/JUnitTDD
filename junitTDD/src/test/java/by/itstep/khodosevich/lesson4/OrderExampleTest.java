package by.itstep.khodosevich.lesson4;

import org.junit.*;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

//@FixMethodOrder  // hashCode
//@FixMethodOrder(MethodSorters.JVM)   // JVM random running
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)   // name ascending ordering

public class OrderExampleTest {

    @BeforeClass
    public static void before(){
        System.out.println("Before OrderExampleTest.class");
    }


    @AfterClass
    public static void after(){
        System.out.println("After OrderExampleTest.class");
    }

    @Test
    public void firstTest(){
        OrderExample.printDetail("firstTest");
    }

    @Test
    public void test(){
        OrderExample.printDetail("test");
    }

    @Test
    public void secondTest(){
        OrderExample.printDetail("secondTest");
    }

}