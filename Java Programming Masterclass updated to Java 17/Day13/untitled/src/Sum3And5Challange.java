public class Sum3And5Challange {

    public static void main(String[] args) {

        int sum = 0;
        int numcount = 0;

        System.out.println("Numbers which are divisible by 3 and 5 : ");
        for (int i = 1; i <= 1000; i++){
            if (numcount >= 5) {
                break;
            }

            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                System.out.print(i + " ");
                numcount++;
            }
        }

        System.out.println("The sum of the all number which are divisible by 3 and 5 is " + sum);
    }
}
