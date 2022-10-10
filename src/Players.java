import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Players {

    private int firstTrial;
    private int secondTrial;
    private int thirdTrial;
    private final Random rand = new Random();
    ArcheryBoard archeryBoard = new ArcheryBoard();

    private  int playerID;
    private static int counter = 1;

    public Players(){
        playerID = counter++;
    }

    private int getWinner() {
        var scoreBoard  = new int[]{ArcheryBoard.getBoard()[0][4], ArcheryBoard.getBoard()[1][4], ArcheryBoard.getBoard()[2][4], ArcheryBoard.getBoard()[3][4]};
        int maxScore = 0;
        int winnerPosition = 0;

        maxScore = getMaxScore(scoreBoard, maxScore);
        winnerPosition = getWinnerPosition(scoreBoard, maxScore, winnerPosition);

        return winnerPosition;
    }

    private int getWinnerPosition(int[] scoreBoard, int maxScore, int winnerPosition) {
        int countWinner  = 0;
     //   List<Integer> countWinners = new ArrayList<>();
        for (int i = 0; i < scoreBoard.length; i++) {
            if(scoreBoard[i] == maxScore){
                countWinner++;
                winnerPosition = i+1;
            }
        }
//        if (countWinner > 1){
//            for (int i = 0; i < scoreBoard.length; i++) {
//                if(scoreBoard[i] == maxScore){
//                    countWinners.add(i);
//                }
//            }
//        }
        return winnerPosition;
    }

    private int getMaxScore(int[] scoreBoard, int maxScore) {
        for (int i = 0; i < scoreBoard.length; i++) {
            if (scoreBoard[i] > maxScore){
                maxScore = scoreBoard[i];
            }
        }
        return maxScore;
    }

    public int isWinner(){
        var board = ArcheryBoard.getBoard();
            if(getWinner() == 1) return board[0][0];
            if(getWinner() == 2) return board[1][0];
            if(getWinner() == 3) return board[2][0];
            if(getWinner() == 4) return board[3][0];
        return -1;
    }


    public int getPlayerID() {
        return playerID;
    }


    public void shootArrow() {
        if (playerID == 1) playerOneShoot();
        if (playerID == 2) playerTwoShoot();
        if (playerID == 3) playerThreeShoot();
        if (playerID == 4) playerFourShoot();
    }

    private void playerOneShoot(){
        var board = ArcheryBoard.getBoard();
        firstTrial = rand.nextInt(10);
        secondTrial = rand.nextInt(10);
        thirdTrial = rand.nextInt(10);

        board[0][0] = playerID;
        board[0][1] = firstTrial;
        board[0][2] = secondTrial;
        board[0][3] = thirdTrial;
        board[0][4] = (firstTrial + secondTrial + thirdTrial);
    }

    private void playerTwoShoot(){
        var board = ArcheryBoard.getBoard();
        firstTrial = rand.nextInt(10);
        secondTrial = rand.nextInt(10);
        thirdTrial = rand.nextInt(10);

        board[1][0] = playerID;
        board[1][1] = firstTrial;
        board[1][2] = secondTrial;
        board[1][3] = thirdTrial;
        board[1][4] = (firstTrial + secondTrial + thirdTrial);
    }

    private void playerThreeShoot(){
        var board = ArcheryBoard.getBoard();
        firstTrial = rand.nextInt(10);
        secondTrial = rand.nextInt(10);
        thirdTrial = rand.nextInt(10);

        board[2][0] = playerID;
        board[2][1] = firstTrial;
        board[2][2] = secondTrial;
        board[2][3] = thirdTrial;
        board[2][4] = (firstTrial + secondTrial + thirdTrial);
    }

    private void playerFourShoot(){
        var board = ArcheryBoard.getBoard();
        firstTrial = rand.nextInt(10);
        secondTrial = rand.nextInt(10);
        thirdTrial = rand.nextInt(10);

        board[3][0] = playerID;
        board[3][1] = firstTrial;
        board[3][2] = secondTrial;
        board[3][3] = thirdTrial;
        board[3][4] = (firstTrial + secondTrial + thirdTrial);
    }
    protected void resetPlayerState(){
        playerID = 0;
        counter = 1;
    }
}
