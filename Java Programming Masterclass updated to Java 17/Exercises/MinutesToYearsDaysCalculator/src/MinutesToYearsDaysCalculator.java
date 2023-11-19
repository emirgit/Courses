public class MinutesToYearsDaysCalculator {
    // write code here

    // my solution
    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        }
        else {
            long years = minutes / 525600;
            long days = (minutes % 525600) / (24 * 60);

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }

    }

    // solution from lectures
    /*private static final int MIN_PER_HOUR = 60;
    private static final int HOURS_PER_DAY = 24;
    private static final int DAYS_PER_YEAR = 365;
    private static final int MIN_PER_DAY = HOURS_PER_DAY * MIN_PER_HOUR;
    private static final int MIN_PER_YEAR = MIN_PER_HOUR * HOURS_PER_DAY * DAYS_PER_YEAR;

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long years = minutes / MIN_PER_YEAR;
        long days = (minutes / MIN_PER_DAY) % DAYS_PER_YEAR;
        System.out.println(minutes + " min = " + years  + " y and " + days + " d");
    }*/
}