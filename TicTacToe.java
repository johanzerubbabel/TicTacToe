public class TicTacToe {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    public static void main(String[] args) {
        while (!gameOver) {
            if (isHumanTurn) {
                System.out.println("Human's turn");
            } else {
                System.out.println("Computer's turn");
            }
            isHumanTurn = !isHumanTurn;
        }
    }
}