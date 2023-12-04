import java.util.Scanner;



public class InputCalculator {


    public static void inputThenPrintSumAndAverage(){
        Scanner scanner =  new Scanner(System.in);

        int sum = 0;
        int numberCounter = 0;

        while (true){
            try {
                sum += Integer.parseInt(scanner.nextLine());
                numberCounter++;
            }
            catch(NumberFormatException e) {
                break;
            }
        }

        if (numberCounter != 0){
            System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum / numberCounter));
        }
        else {
            System.out.println("SUM = 0 AVG = 0");
        }
    }
}