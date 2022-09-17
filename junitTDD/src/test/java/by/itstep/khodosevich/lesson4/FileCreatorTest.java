package by.itstep.khodosevich.lesson4;

import org.junit.Test;


import java.io.IOException;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

public class FileCreatorTest {

    @Test(expected = IOException.class)
    public void createTempFile() throws IOException {
        FileCreator.createTempFile();
    }


    @Test
    public void testByTryCatch(){
        try {
            FileCreator.createTempFile();
//            throw new IOException("asdlkfjasd"); // соосбщения из метода нету!!!
            fail("Expected IOException");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            assertNotEquals("", e.getMessage());
        }
    }

    @Test
    public void testByAssertJ(){

        //AssertJ - нету dependency
    }
}