package MixSolutions;

/**
 * Created by shubham.goyal on 12/7/16.
 */
public class SpiralMatrixII59 {

    public int[][] generateMatrix(int n) {

        int[][] result = new int[n][n];

        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;
        int number = 1;

        while(left <= right)
        {
            for(int i = left; i <= right; i++) {
                result[left][i] = number++;
            }
            top++;
            for(int i = top; i <= bottom; i++ ) {
                result[i][right] = number++;
            }
            right--;
            for(int i = right; i >= left; i--) {
                result[bottom][i] = number++;
            }
            bottom--;

            for(int i = bottom; i >= top; i--) {
                result[i][left] = number++;
            }
            left++;
        }

        return result;
    }
}
