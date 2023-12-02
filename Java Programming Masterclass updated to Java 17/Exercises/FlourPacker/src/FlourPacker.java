
/*
first Solution

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal){
        boolean res = false;

        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return res;
        }

        while (goal >= 5 && bigCount > 0){
            goal -= 5;
            bigCount--;
        }

        if (goal == 0){
            res = true;
        }
        else {
            while (goal != 0 && smallCount > 0){
                goal -= 1;
                smallCount--;
            }
            if (goal == 0){
                res = true;
            }
        }

        return res;
    }

}
*/

//second and better solution
public class FlourPacker {

    private static final int BIG_WEIGHT = 5;

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        boolean result = false;
        int totalBigWeight = bigCount * BIG_WEIGHT;
        if (totalBigWeight >= goal) {
            int remaining = goal % BIG_WEIGHT;
            if (smallCount >= remaining) {
                result = true;
            }
        } else {
            if (smallCount >= goal - totalBigWeight) {
                result = true;
            }
        }
        return result;
    }
}