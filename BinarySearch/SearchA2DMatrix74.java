package BinarySearch;

/**
 * Created by shubham.goyal on 2/15/17.
 */
public class SearchA2DMatrix74 {

    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        if(m == 0 ) {
            return false;
        }

        int n = matrix[0].length;
        if(n == 0 ) {
            return false;
        }
        int start = 0;
        int end = (m * n) - 1;

        int temp = (start + end) / 2;
        int x = temp / n;
        int y = temp % n;

        while(start <= end) {

            // System.out.println("Start " + start);
            // System.out.println("End " + end);

            if(matrix[x][y] == target) {
                return true;
            }
            else if(matrix[x][y] < target) {
                start = temp + 1;
            }
            else {
                end = temp - 1;
            }


            temp = (start + end) / 2;
            x = temp / n;
            y = temp % n;
        }
        return false;
    }
}
