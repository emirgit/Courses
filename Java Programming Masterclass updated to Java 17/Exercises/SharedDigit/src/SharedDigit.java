public class SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2){

        if (!((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99))){
            return false;
        }

        /*
        (num1 % 10 == num2 % 10) = checking last digits of numbers
        (num1 / 10 == num2 % 10) = checking first digit of first number and last digit of second number
        (num1 % 10 == num2 / 10) = checking last digit of first number andfirst digit of second number
         = checking last digits of numbers
         */
        return ((num1 % 10 == num2 % 10) ||
                (num1 / 10 == num2 % 10) ||
                (num1 % 10 == num2 / 10) ||
                (num1 / 10 == num2 / 10));

    }
}
