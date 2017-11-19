package BinarySearch;

/**
 * Created by shubham.goyal on 2/15/17.
 */
public class Searcha2DMatrixII240 {

    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int row = 0;
        int col = matrix[0].length - 1;
        while(row < matrix.length && col >= 0) {

            // System.out.println(row +  " " + col);
            if(matrix[row][col] == target) {
                return true;
            }
            else if(matrix[row][col] > target) {
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
}
