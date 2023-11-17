public class SpeedConverter {
    // write code here

    public static long toMilesPerHour(double kilometersPerHour){

        if (kilometersPerHour < 0){
            return -1;
        }

        /*
        round() takes 1 parameter that is either float or double
        and it return int(for float) or long(for double) respect to type of parameter
        */

        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour){
        long result = toMilesPerHour(kilometersPerHour);

        if (result != -1){
            System.out.println(kilometersPerHour + " km/h = " + result + " mi/h");
        }
        else {
            System.out.println("Invalid Value");
        }
    }
}
