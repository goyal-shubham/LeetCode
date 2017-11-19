package DynamicProgramming;

/**
 * Created by shubham.goyal on 2/15/17.
 */
public class UniquePaths62 {

    public int uniquePaths(int m, int n) {

        int[][] dp = new int[m][n];
        for(int i = m - 1; i >= 0; i-- ) {
            dp[i][n - 1] = 1;
        }

        for(int j = n - 1; j >= 0; j-- ){
            dp[m - 1][j] = 1;
        }

        for(int i = m - 2; i >= 0; i--) {
            for(int j = n - 2; j >= 0; j--) {
                dp[i][j] = dp[i+1][j] + dp[i][j+1];
            }
        }

        return dp[0][0];
    }
}
