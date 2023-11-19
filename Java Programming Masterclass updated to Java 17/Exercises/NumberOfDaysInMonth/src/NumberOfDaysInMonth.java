public class NumberOfDaysInMonth {

    private static final int INVALID_VALUE = -1;
    public static boolean isLeapYear(int year){

        boolean result = false;

        if (year >= 1 && year <= 9999){

            if (year % 400 == 0){
                result = true;
            }
            else if (year % 4 == 0 && year % 100 != 0){
                result = true;
            }

        }

        return (result);
    }

    public static int getDaysInMonth(int month, int year){
        if (month < 1 || month > 12){
            return INVALID_VALUE;
        }
        else if (year < 1 || year > 9999){
            return INVALID_VALUE;
        }

        return switch (month){
            case 1,3,5,7,8,10,12 -> 31;
            case 4,6,9,11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
/*
            {
                if (isLeapYear(year)){
                    yield 29;
                }
                else {
                    yield 28;
                }
            }
*/
            default -> INVALID_VALUE;
        };
    }
}