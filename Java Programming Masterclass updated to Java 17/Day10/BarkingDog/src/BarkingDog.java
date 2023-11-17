public class BarkingDog {
    // write code here

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay){
        boolean res = false;

        if (isBarking == true && ((hourOfDay < 8 && hourOfDay >= 0) || hourOfDay == 23)){
            res = true;
        }

        return res;
    }
}
