package Backtracking;

/**
 * Created by shubham.goyal on 2/21/17.
 */
public class SudokuSolver {

    int N;

    public void solveSudoku(char[][] board) {
        N = board.length;

        if(solveSudokuUtil(board)){
            System.out.println("solved");
        }else{
            System.out.println("Not Solved");
        }
    }

    public boolean findEmptyPlace(char[][] board, int[] coordinate) {

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == '.') {
                    coordinate[0] = i;
                    coordinate[1] = j;
                    return false;
                }
            }
        }
        return true;
    }

    public void printArray(char[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.print(data[i][j]);
            }
            System.out.println();
        }
        System.out.println("__________________________");
        System.out.println();
    }

    public boolean solveSudokuUtil(char[][] board) {

        printArray(board);
        int[] coordinate = new int[2];

        if (findEmptyPlace(board, coordinate)) {
            return true;
        }

        int row = coordinate[0], col = coordinate[1];
        for (int i = 1; i <= N; i++) {

            if (isSafeLocation(board, row, col, i)) {
                board[row][col] = (char) (i + '0');
                if (solveSudokuUtil(board)) {
                    return true;
                }
                board[row][col] = '.';
            }
        }

        return false;
    }

    public boolean isSafeLocation(char[][] board, int row, int col, int num) {

        //Check for column
        for (int i = 0; i < N; i++) {
            if (board[i][col] == num + '0') {
                return false;
            }
        }

        //Check for row
        for (int i = 0; i < N; i++) {
            if (board[row][i] == num + '0') {
                return false;
            }
        }

        //Check in the small square
        int startRow = row - (row % 3);
        int startCol = col - (col % 3);
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num + '0') {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        SudokuSolver obj = new SudokuSolver();
        String[] board = new String[]{"..9748...", "7........", ".2.1.9...", "..7...24.", ".64.1.59.", ".98...3..", "...8.3.2.", "........6", "...2759.."};
        char[][] input = new char[9][9];
        for (int i = 0; i < 9; i++) {
            input[i] = board[i].toCharArray();
        }
        obj.solveSudoku(input);
    }
}
