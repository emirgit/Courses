public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(11400));
        System.out.println(getDurationString(155,15));
    }

    /*public static String getDurationString(int seconds){
        if (seconds < 0){
            return "Invalid Parameter";
        }
        int hours = seconds / 3600;
        seconds %= 3600;
        int minutes = seconds / 60;
        seconds %= 60;

        return (hours + "h " + minutes + "m " + seconds + "s");
    }
    public static String getDurationString(int minutes, int seconds){
        if (minutes < 0 || seconds < 0 || seconds > 59){
            return "Invalid Parameter";
        }

        seconds += minutes * 60;

        return getDurationString(seconds);
    }*/
    public static String getDurationString(int seconds) {
/*        if (seconds < 0){
            return "Invalid data for seconds(-";
        }*/

        if (seconds < 0) {
            return "Invalid data for seconds(" + seconds
                    + "), must be a positive integer value";
        }

        int minutes = seconds / 60;
        return getDurationString(minutes, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {
/*        if (minutes < 0 || seconds < 0 || seconds > 59){
            return "Invalid Data";
        }*/

        if (minutes < 0) {
            return "Invalid data for minutes(" + minutes
                    + "), must be a positive integer value";
        }

        if (seconds < 0 || seconds > 59) {
            return "Invalid data for seconds(" + seconds
                    + "), must be between 0 and 59";
        }

        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;

        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
}