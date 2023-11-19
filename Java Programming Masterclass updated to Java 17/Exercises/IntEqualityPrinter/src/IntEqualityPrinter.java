public class IntEqualityPrinter {

    // my solution
    public static void printEqual(int num1, int num2, int num3){
        if (num1 < 0 || num2 < 0 || num3 < 0){
            System.out.println("Invalid Value");
        }
        else if (num1 == num2 && num2 == num3){
            System.out.println("All numbers are equal");
        }
        else if (num1 != num2 && num2 != num3 && num3 != num1){
            System.out.println("All numbers are different");
        }
        else {
            System.out.println("Neither all are equal or different");
        }
    }

    // solution from course
    /*
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    private static final String ALL_EQUAL_MESSAGE = "All numbers are equal";
    private static final String NEITHER_ALL_EQUAL_MESSAGE = "Neither all are equal or different";
    private static final String ALL_DIFF_MESSAGE = "All numbers are different";

    public static void printEqual(int a, int b, int c) {

        if (a < 0 || b < 0 || c < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
        } else if (a == b && b == c) {
            System.out.println(ALL_EQUAL_MESSAGE);
        } else if ((a == b) || (a == c) || (b == c)) {
            System.out.println(NEITHER_ALL_EQUAL_MESSAGE);
        } else {
            System.out.println(ALL_DIFF_MESSAGE);
        }
    }
    */
}