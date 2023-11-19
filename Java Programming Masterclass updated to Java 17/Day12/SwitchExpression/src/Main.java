public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {
            printDayOfWeek(i);
        }

        for (int i = 0; i < 8; i++) {
            printWeekDay(i);
        }
    }

    public static void printDayOfWeek(int day){

        String dayOfTheWeek = switch (day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> {
                System.out.println("The number(" + day + ") is not valid");
                yield "Error";
            }
        };

        System.out.println("The day showed with number is " + dayOfTheWeek);
    }

    public static void printWeekDay(int day){
        String dayOfTheWeek = "Error";

        if (day == 0) {
            dayOfTheWeek = "Sunday";
        } else if (day == 1) {
            dayOfTheWeek = "Monday";
        } else if (day == 2) {
            dayOfTheWeek = "Tuesday";
        } else if (day == 3) {
            dayOfTheWeek = "Wednesday";
        } else if (day == 4) {
            dayOfTheWeek = "Thursday";
        } else if (day == 5) {
            dayOfTheWeek = "Friday";
        } else if (day == 6) {
            dayOfTheWeek = "Saturday";
        } else {
            System.out.println("The number(" + day + ") is not valid");
        }

        System.out.println("The day showed with number is " + dayOfTheWeek);
    }
}
