public class NumberPalindrome {



    public static boolean isPalindrome(int number) {
        int reversed_number = 0;
        int temp = number;

        while (temp > 9) {
            reversed_number += temp % 10;
            temp /= 10;
            reversed_number *= 10;
        }
        reversed_number += temp;


        return reversed_number == number;
    }
}