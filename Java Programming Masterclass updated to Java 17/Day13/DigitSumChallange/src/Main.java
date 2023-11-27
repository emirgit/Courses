public class Main {

    public static final int INVALID_NUMBER = -1;

    public static void main(String[] args) {

        System.out.println(sumDigits(125));
    }

    public static int sumDigits(int number) {
        if (number < 0){
            return INVALID_NUMBER;
        }

        int digitSum = 0;

        while(number > 9){
            digitSum += number % 10;
            number /= 10;
        }
        digitSum += number;

        return  digitSum;
    }
}
