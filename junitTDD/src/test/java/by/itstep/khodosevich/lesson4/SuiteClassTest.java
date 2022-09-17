package by.itstep.khodosevich.lesson4;

import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({SecondClassTest.class, OrderExampleTest.class})
@FixMethodOrder(MethodSorters.JVM)
public class SuiteClassTest {

}
