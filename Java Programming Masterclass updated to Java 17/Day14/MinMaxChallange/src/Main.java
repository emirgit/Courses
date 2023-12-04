import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        System.out.println("Please enter a number or press 'q' or any character to quit and see the results");
        while (true){

            String input = scanner.nextLine();

            if(input.equals("q")){
                break;
            }

            try {
                double number = Double.parseDouble(input);
                if (number > max){
                    max = number;
                }
                if (number < min) {
                    min = number;
                }

            }
            catch (NumberFormatException ex){
                break;
            }

        }

        if (max != Double.MIN_VALUE){
            System.out.println("The maximum number that entered is " + max);
            System.out.println("The minimum number that entered is " + min);
        }
        else {
            System.out.println("No number entered");
        }


    }
}
