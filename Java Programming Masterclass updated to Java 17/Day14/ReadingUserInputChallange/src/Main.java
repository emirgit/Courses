import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //int number;
        double number;
        double sum = 0;
        int numberCounter = 0;

        System.out.println("Please enter 5 valid number");
        do {
            System.out.print("Enter number #" + (numberCounter + 1) + ":");
            try {
            //    number = Integer.parseInt(scanner.nextLine());
                number = Double.parseDouble(scanner.nextLine());
                sum += number;

                numberCounter++;
            }
            catch (NumberFormatException ex){
                System.out.println("Invalid number !");
            }

        } while(numberCounter < 5);

        System.out.println("The sum of the entered 5 number is " + sum);
    }
}
