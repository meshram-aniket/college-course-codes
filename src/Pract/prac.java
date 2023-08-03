package Pract;

public class prac {
    public static void main(String[] args) {
        boolean[][] board = {
                {false, false, false, false},
                {false, false, false, false},
                {false, false, false, false},
                {false, false, false, false}
        };
        Nqueens(board, 0);

    }

    public static void Nqueens(boolean[][] board, int row) {

        if (row == board.length) {
            display(board);
            System.out.println();
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                Nqueens(board, row + 1);
                board[row][col] = false;
            }
        }
    }


    public static boolean isSafe(boolean[][] board, int row, int col) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row-i][col-i]) {
                return false;
            }
        }


        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row-i][col+i]) {
                return false;
            }
        }
        return true;
    }

    public static void display(boolean[][] board) {
        for (boolean[] row: board ) {
            for (boolean element: row) {
                if (element) {
                    System.out.print("Q ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
