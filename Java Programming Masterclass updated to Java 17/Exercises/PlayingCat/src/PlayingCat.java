public class PlayingCat {
    // write code here

    // my solution
    public static boolean isCatPlaying(boolean summer, int temperature){
        boolean result = false;

        if (summer){
            if (temperature >= 25 && temperature <= 45){
                result = true;
            }
        }
        else {
            if (temperature >= 25 && temperature <= 35){
                result = true;
            }
        }

        return result;
    }

    //solution from course
    /*
    public static boolean isCatPlaying(boolean summer, int temperature) {

        int max = summer ? 45 : 35;
        return temperature >= 25 && temperature <= max;
    }
    */
}