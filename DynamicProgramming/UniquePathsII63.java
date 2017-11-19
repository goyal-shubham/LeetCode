package DynamicProgramming;

/**
 * Created by shubham.goyal on 2/15/17.
 */
public class UniquePathsII63 {

    public int uniquePathsWithObstacles(int[][] input)   {

        if(input == null || input.length == 0) {
            return 0;
        }

        int m = input.length;
        int n = input[0].length;
        int[][] dp = new int[m][n];

        if(input[m - 1][n - 1] == 1) {
            return 0;
        }
        else {
            dp[m - 1][n - 1] = 1;
        }


        for(int i = m - 2; i >= 0; i--) {
            if(input[i][n - 1] == 1) {
                dp[i][n - 1] = 0;
            }
            else {
                dp[i][n - 1] = dp[i + 1][ n - 1];
            }
        }

        for(int j = n - 2; j >= 0; j--) {
            if(input[m - 1][j] == 1) {
                dp[m - 1][j] = 0;
            }
            else {
                dp[m - 1][j] = dp[m - 1][j + 1];
            }
        }

        for(int i = m - 2; i >= 0; i--) {
            for(int j = n - 2; j >= 0; j--) {
                if(input[i][j] == 1) {
                    dp[i][j] = 0;
                }
                else {
                    dp[i][j] = dp[i+1][j] + dp[i][j + 1];
                }
            }
        }

        return dp[0][0];
    }
}
