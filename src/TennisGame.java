public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int scoreOfPlayer1, int scoreOfPlayer2) {
        String[] wayOfCalls = {"Love-All","Fifteen-All","Thirty-All","Forty-All","Deuce"};
        String wayOfCall = "";
        int tempScore=0;
        if (scoreOfPlayer1==scoreOfPlayer2)
        {
            wayOfCall = wayOfCalls[scoreOfPlayer1];
        }
        else if (scoreOfPlayer1>=4 || scoreOfPlayer2>=4)
        {
            int differenceOfScore = scoreOfPlayer1-scoreOfPlayer2;
            if (differenceOfScore==1)
                wayOfCall ="Advantage player1";
            else if (differenceOfScore ==-1)
                wayOfCall ="Advantage player2";
            else if (differenceOfScore>=2)
                wayOfCall = "Win for player1";
            else wayOfCall ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = scoreOfPlayer1;
                else {
                    wayOfCall+="-";
                    tempScore = scoreOfPlayer2;
                }
                String[] wayOfCall2 = {"Love","Fifteen","Thirty","Forty"};
                wayOfCall+=wayOfCall2[tempScore];
            }
        }
        return wayOfCall;
    }
}
