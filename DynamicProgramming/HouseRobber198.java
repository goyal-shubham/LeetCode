package DynamicProgramming;

import java.util.*;

/**
 * Created by shubham.goyal on 2/15/17.
 */
public class HouseRobber198 {
    int[] dp;
    public int rob(int[] nums) {

        dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return robHouse(nums, 0, 0);

    }

    public int robHouse(int[] nums, int start, int prevTotal) {

        if(start >= nums.length) {
            return 0;
        }

        if(dp[start] != -1 ){
            return dp[start];
        }

        dp[start] = Math.max(nums[start] + robHouse(nums, start + 2, prevTotal + nums[start]) , robHouse(nums, start + 1, prevTotal));

        return dp[start];
    }
}
