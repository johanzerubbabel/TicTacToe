import java.util.Random;

public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };
    static char computerSymbol = 'O';

    public static void main(String[] args) {
        computerMove();
    }

    static void computerMove() {
        Random random = new Random();
        int row, col;
        do {
            int slot = random.nextInt(9) + 1;
            row = (slot - 1) / 3;
            col = (slot - 1) % 3;
        } while (board[row][col] != '-');
        board[row][col] = computerSymbol;
        System.out.println("Computer placed at row " + row + ", col " + col);
    }
}