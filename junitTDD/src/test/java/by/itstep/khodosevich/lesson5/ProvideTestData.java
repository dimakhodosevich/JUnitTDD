package by.itstep.khodosevich.lesson5;

public class ProvideTestData {
    public static Object[] provideBasicData(){
        return new Object[]{
                new Object[]{1,2,3},
                new Object[]{-10,30,20},
                new Object[]{Integer.MAX_VALUE, 2, Integer.MAX_VALUE},
                new Object[]{Integer.MIN_VALUE, -8, Integer.MIN_VALUE}
        };
    }

    public static Object[] provideEdgeCaseData(){

        return new Object[]{
                new Object[]{Integer.MAX_VALUE, 2, Integer.MAX_VALUE},
                new Object[]{Integer.MIN_VALUE, -4, Integer.MIN_VALUE}
        };
    }
}
