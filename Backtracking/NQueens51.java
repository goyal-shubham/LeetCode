package Backtracking;

import java.util.*;

/**
 * Created by shubham.goyal on 2/20/17.
 */
public class NQueens51 {

    int size;
    List<List<String>> answer;

    public List<List<String>> solveNQueens(int N) {

        answer = new LinkedList<>();
        size = N;

        for (int row = 0; row < N; row++) {

            int[][] result = new int[N][N];
            result[row][0] = 1;
            solveQueens(1, result);
        }

        System.out.println(answer.size());
        return answer;

    }

    public void addNewStringToResult(int[][] result) {

        List<String> solution = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            StringBuffer currentRow = new StringBuffer();
            for (int j = 0; j < size; j++) {
                if (result[i][j] == 1) {
                    currentRow.append("Q");
                } else {
                    currentRow.append(".");
                }
            }
            solution.add(currentRow.toString());
        }
        answer.add(solution);
    }

    public boolean solveQueens(int col, int[][] currentMetrix) {

        if (col >= size) {
            addNewStringToResult(currentMetrix);
            return true;
        }

        boolean found = false;
        for (int row = 0; row < size; row++) {

            if (checkForSafety(row, col, currentMetrix)) {
                currentMetrix[row][col] = 1;
                if (solveQueens(col + 1, currentMetrix)) {
                    found = true;
                }
                currentMetrix[row][col] = 0;
            }

        }

        return false;


    }

    public boolean checkForSafety(int row, int col, int[][] currentMetrix) {

        for (int i = 0; i < col; i++) {
            if (currentMetrix[row][i] == 1) {
                return false;
            }
        }

        for (int i = col - 1, j = row - 1; i >= 0 && j >= 0; i--, j--) {
            if (currentMetrix[j][i] == 1) {
                return false;
            }
        }

        for (int i = col - 1, j = row + 1; i >= 0 && j < size; i--, j++) {
            if (currentMetrix[j][i] == 1) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {

        NQueens51 obj = new NQueens51();
        obj.solveNQueens(4);
    }
}



