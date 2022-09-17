package by.itstep.khodosevich.lesson4;

import org.junit.Test;

public class TimeOutTest {

    @Test(timeout =  500)
    public void timeout() throws InterruptedException {
        while(true){
            Thread.sleep(500);
        }
    }
}
