package by.itstep.khodosevich.lesson4;

import org.hamcrest.CoreMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class RuleClassTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder(); // правило на папку

    @Test
    public void givenTempFolderRule_whenNewFile_thenFileIsCreated() throws IOException {
        File file = temporaryFolder.newFile("file-test.txt");

        assertTrue("The file should have been created: ", file.isFile());
        assertEquals("Temp folder and test file shoud match", temporaryFolder.getRoot(),
                file.getParentFile());
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void givenIllegalArgument_whenExceptionThrow_messageAndCauseMatch(){
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expect(CoreMatchers.isA(NullPointerException.class));
        expectedException.expectMessage("This is message");

        throw new IllegalArgumentException("This is message", new NullPointerException());
    }

    @Rule
    public TestName testName = new TestName();

    @Test
    public void testName(){
        assertEquals("testName", testName.getMethodName());
    }

    @Rule
    public Timeout timeout = Timeout.seconds(3);

    @Test
    public void givenLongRunningTest_whenTimeOut_thenTestFail() throws InterruptedException{
        TimeUnit.SECONDS.sleep(1);
    }

    @Rule
    public ErrorCollector errorCollector = new ErrorCollector();

    @Test
    public void givenMultipleErrors_whenTestRun_thenCollectorRoportsErrors(){
        errorCollector.addError(new Throwable("First thing went wrong"));
        errorCollector.addError(new Throwable("Second thing went wrong"));
    }

    List<String> logs = new ArrayList<>();

    @Rule
    public Verifier verifier =new Verifier() {
        @Override
        protected void verify() throws Throwable {
            assertFalse("Message log in not empty", logs.isEmpty());
        }
    };

    @Test
    public void givenNewMessage_whenVerifier_thenMessageLogNotEmpty(){
        logs.add("There is a new message");
    }

}
