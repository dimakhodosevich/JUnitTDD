package by.itstep.khodosevich.lesson5;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ModuleTest {
    @Test
    public void testAccount(){
        System.out.println("Fast testAccaunt");
    }

    @Test
    @Category({FastTest.class, SlowTest.class})
    public void addAccountToDb(){
        System.out.println("Fast and Slow test addAccountToDb");
    }
}
