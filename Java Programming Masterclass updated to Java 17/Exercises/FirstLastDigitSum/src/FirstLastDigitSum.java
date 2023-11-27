public class FirstLastDigitSum {

    private static final int INVALID_VALUE = -1;

    public static int sumFirstAndLastDigit(int number){

        if (number < 0){
            return INVALID_VALUE;
        }

        int lastdigit = number % 10;

        while (number > 9){
            number /= 10;
        }

        return lastdigit + number;
    }
}