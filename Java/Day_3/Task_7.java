package MyCodingJourney.Java.Day_3;

public class Task_7 {

    public static void main(String[] args) {
     int highScorePosition = calculateHighScorePosition(1500);
     displayHighScorePosition( "tim",highScorePosition);

     highScorePosition = calculateHighScorePosition(1000);
     displayHighScorePosition( "Percy",highScorePosition);

      highScorePosition = calculateHighScorePosition(500);
     displayHighScorePosition( "bob",highScorePosition);

      highScorePosition = calculateHighScorePosition(100);
     displayHighScorePosition( "Gibert",highScorePosition);

       highScorePosition = calculateHighScorePosition(25);
     displayHighScorePosition( "James",highScorePosition);
    }
    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " Managed to get into position" + highScorePosition + "on the high score list");

    }
    public static int calculateHighScorePosition(int playerScore){
    if(playerScore >= 1000){
        return 1;
    }
    else if (playerScore >= 500) {
        return 2;
    }
    else if (playerScore >= 100){
        return 3;
    }
    else{
        return 4;
    }
    }
}
