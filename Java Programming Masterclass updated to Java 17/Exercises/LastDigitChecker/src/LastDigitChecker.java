public class LastDigitChecker {

    public static boolean hasSameLastDigit(int num1, int num2, int num3){

        if (!(isValid(num1) && isValid(num2) && isValid(num3))){
            return false;
        }

        /*
        (num1 % 10 == num2 % 10) = checking last digits of numbers
        (num1 / 10 == num2 % 10) = checking first digit of first number and last digit of second number
        (num1 % 10 == num2 / 10) = checking last digit of first number andfirst digit of second number
         = checking last digits of numbers
         */
        return ((num1 % 10 == num2 % 10) ||
                (num1 % 10 == num3 % 10) ||
                (num2 % 10 == num3 % 10));

    }

    public static boolean isValid(int number){


        return (number >= 10 && number <= 1000);
    }
}