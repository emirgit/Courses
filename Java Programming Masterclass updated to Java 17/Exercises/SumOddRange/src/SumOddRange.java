public class SumOddRange {
    public static boolean isOdd(int number){
        boolean res = false;

        if (number > 0 && number % 2 != 0){
            res = true;
        }

        return res;
    }

    public static int sumOdd(int start, int end){

        // checking the unwanted condition
        // if it is, return -1
        if (start < 0 || end < 0 || start > end){
            return -1;
        }


        int sum = 0;

        for (int i = start;i <= end; i++){
            if (isOdd(i)) {
                sum += i;
            }
        }

        return sum;
    }
}
