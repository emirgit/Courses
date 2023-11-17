public class LeapYear {
    // write code here

    public static boolean isLeapYear(int year){
        boolean res = false;

        if ((year >= 1 && year <= 9999) && year % 4 == 0){

            if(year % 100 == 0){
                res = (year % 400 == 0); //if it can be divided 400 it is leap year
            }
            else{
                res = true;
            }

        }

        return res;
    }
}
