public class EvenDigitSum {

    private static final int INVALID_VALUE = -1;

    public static int getEvenDigitSum(int number){
        if (number < 0){
            return INVALID_VALUE;
        }

        int sum = 0;
        int digit = 0;

        while (number != 0){
            digit = number % 10;

            if (digit % 2 == 0){
                sum += digit;
            }

            number /= 10;
        }

        return sum;
    }
}