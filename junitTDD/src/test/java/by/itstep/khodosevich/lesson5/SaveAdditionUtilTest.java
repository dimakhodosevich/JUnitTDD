package by.itstep.khodosevich.lesson5;

import junit.framework.TestCase;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class SaveAdditionUtilTest extends TestCase {

    private SaveAdditionUtil util = new SaveAdditionUtil();

    // only primitives types
    @Test
//    @Parameters({
//            "1, 2, 3",
//            "-10, 30, 20",
//            "15, -5, 10",
//            "-5, -10, -15"
//    })

//    @Parameters(method = "parametersToTestAdd")
//    @Parameters

//    @Parameters(source = ProvideTestData.class)
    @FileParameters("src/test/resource/Parameters.csv") // only primitive types
    public void whenWithAnnotationProviderParams_thenSafeAdd(int a, int b, int result){
        assertEquals(result, util.safeAdd(a,b));
    }


    public Object[] parametersToTestAdd(){
        return new Object[]{
          new Object[]{1,2,3},
          new Object[]{-10,30,20},
          new Object[]{Integer.MAX_VALUE, 2, Integer.MAX_VALUE},
          new Object[]{Integer.MIN_VALUE, -8, Integer.MIN_VALUE}
        };
    }

    public Object[] parametersForWhenWithAnnotationProviderParams_thenSafeAdd(){
        return new Object[]{
                new Object[]{1,2,3},
                new Object[]{-10,30,20},
                new Object[]{Integer.MAX_VALUE, 2, Integer.MAX_VALUE},
                new Object[]{Integer.MIN_VALUE, -8, Integer.MIN_VALUE}
        };
    }

}