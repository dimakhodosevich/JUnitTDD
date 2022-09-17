package by.itstep.khodosevich.lesson1;

public class Number {
    public static int sum(int number){
        int result = 0;
        for (int i = 0; i <= number; i++) {
            result+=i;
        }

        return result;
    }

    public static int multiple(int number1, int number2){
        return number1*number2;
    }
}
