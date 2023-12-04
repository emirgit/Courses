public class DiagonalStar {

    private static final String INVALID_VALUE = "Invalid Value";

    public static void printSquareStar(int number){
        if (number < 5){
            System.out.println(INVALID_VALUE);
            return;
        }

        for (int i = 0; i < number; i++){

            for (int j = 0; j < number; j++){
                if (i == 0 || i == number - 1){
                    System.out.print("*");
                }
                else if (j == 0 || j == number - 1){
                    System.out.print("*");
                }
                else if (j - i == 0){
                    System.out.print("*");
                }
                else if (i + j == number - 1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");

                }
            }

            System.out.println();
        }

    }
}
