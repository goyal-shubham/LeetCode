package Arrays;

import Backtracking.SudokuSolver;

/**
 * Created by shubham.goyal on 2/21/17.
 */
public class ValidSudoku {

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

    public boolean isValidSudoku(char[][] board) {
        printArray(board);

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    int num = board[i][j];
                    board[i][j] = '.';
                    if(!checkForValidity(board, i, j, num)){
                        return false;
                    }
                    board[i][j] = (char) num;
                }
            }
        }
        return true;

    }

    public boolean checkForValidity(char[][] board, int row, int col, int num) {

        for(int i = 0; i < 9; i++ ) {
            if(board[row][i] == num) {
                return false;
            }
        }

        for(int i = 0; i < 9; i++ ) {
            if(board[i][col] == num) {
                return false;
            }
        }

        int startRow = row - (row % 3);
        int startCol = col - (col % 3);
        for(int i = startRow; i < startRow + 3; i++ ) {
            for(int j = startCol; j < startCol + 3; j++ ) {
                if(board[i][j] == num) {
                    return false;
                }
            }

        }

        return true;
    }

    public static void main(String[] args) {
        ValidSudoku obj = new ValidSudoku();
        String[] board = new String[]{"..9748...", "7........", ".2.1.9...", "..7...24.", ".64.1.59.", ".98...3..", "...8.3.2.", "........6", "...2759.."};
        char[][] input = new char[9][9];
        for (int i = 0; i < 9; i++) {
            input[i] = board[i].toCharArray();
        }
        obj.isValidSudoku(input);
    }
}
