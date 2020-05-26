public class Challenge {

    public static void main(String[] args) {

        displayHighScorePosition("Tim1", calculateHighScorePosition(1500));

        displayHighScorePosition("Tim2", calculateHighScorePosition(900));

        displayHighScorePosition("Tim3", calculateHighScorePosition(400));

        displayHighScorePosition("Tim4", calculateHighScorePosition(50));
    }

    public static int calculateHighScorePosition(int score){

        if (score >= 1000){
            return 1;
        }
        if (score >= 500){
            return 2;
        }
        if (score >= 100){
            return 3;
        }
        return 4;
    }

    public static void displayHighScorePosition(String playerName, int position){

        System.out.println(playerName + " managed to get to position " + position + " on the high score table.");
    }
}
