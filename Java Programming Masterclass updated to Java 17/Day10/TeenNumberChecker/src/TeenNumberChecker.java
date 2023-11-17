public class TeenNumberChecker {
    // write code here

    public static boolean hasTeen(int num1, int num2, int num3){

        return (isTeen(num1) || isTeen(num2) || isTeen(num3));
    }

    public static boolean isTeen(int number){

        return (number <= 19 && number >= 13);
    }
}