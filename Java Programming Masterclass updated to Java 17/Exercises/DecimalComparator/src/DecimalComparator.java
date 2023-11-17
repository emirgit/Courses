public class DecimalComparator {
    // write code here

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
        long multipliedFirstNumber = (int) (firstNumber * 1000);
        long multipliedSecondNumber = (int) (secondNumber * 1000);

        return multipliedFirstNumber == multipliedSecondNumber;
    }

}