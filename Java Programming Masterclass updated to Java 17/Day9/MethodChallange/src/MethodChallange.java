public class MethodChallange {
    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(800);
        displayHighScorePosition("Emir", highScorePosition);

        highScorePosition = calculateHighScorePosition(300);
        displayHighScorePosition("Muhammed", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Lusi", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Hun", highScorePosition);

    }

    public static void displayHighScorePosition(String playersName, int position){

        System.out.println(playersName + " managed to get into position "
                + position + " on the high score list");

    }

    public static int calculateHighScorePosition(int playersScore){

        int result = 4;

        if (playersScore >= 1000){
            result = 1;
        }
        else if (playersScore >= 500){
            result = 2;
        }
        else if (playersScore >= 100){
            result = 3;
        }

        return (result);
    }

}