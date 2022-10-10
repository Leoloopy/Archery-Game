public class ArcheryBoard {
    private static int[][] board;

    public ArcheryBoard(){
        board = new int[4][5];
    }

    public static int[][] getBoard() {
        return board;
    }

    public  static void displayBoard(){
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%n","Player No.", "first trial ", "second trial ", "third trial ", "Max score ");
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col]);
                System.out.printf("%-15s", "");
            }
            System.out.println();
        }
    }
}
