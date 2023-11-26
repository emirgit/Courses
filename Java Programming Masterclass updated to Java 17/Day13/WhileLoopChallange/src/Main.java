public class Main {

    public static void main(String[] args) {

        int i = 5;
        int countOfEven = 0;
        int countOfOdd = 0;


        while (i <= 20){


            if (isEvenNumber(i)){
                System.out.println(i + " ");
                countOfEven++;
            }
            else {
                countOfOdd++;
            }

            if (countOfEven >= 5){
                break;
            }

            i++;
        }

        System.out.println(countOfOdd + " odd numbers found");
        System.out.println(countOfEven + " even numbers found");
    }

    public static boolean isEvenNumber(int number){

        return (number % 2 == 0);
    }
}
