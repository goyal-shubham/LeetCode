package DynamicProgramming;


/**
 * Created by shubham.goyal on 2/15/17.
 */
public class CoinChange322 {

    public static int coinChange(int[] coins, int amount) {

        if(amount == 0) {
            return 0;
        }

        int[] dp = new int[amount + 1];

        for(int i = 1; i <= amount; i++) {

            int min = -1;
            for (int j : coins) {

                if (i >= j && dp[i - j] != -1) {
                    int temp = dp[i - j] + 1;
                    min = min < 0 ? temp : Math.min(temp, min);
                }
            }

            dp[i] = min;

        }

        return dp[amount];

    }


}
