package DynamicProgramming;

/**
 * Created by shubham.goyal on 2/17/17.
 */

import java.util.*;
public class OnesAndZeroes474 {


    int max ;
    public int findMaxForm(String[] strs, int m, int n) {

        max = 0;
        int[] dp = new int[strs.length];
        Arrays.fill(dp, -1);
        return findMaxForm(strs, 0, m , n , dp);

    }

    public int findMaxForm(String[] strs, int start, int m, int n, int[] dp) {

        if(m == 0 && n == 0) {
            return 0;
        }
        else if(start >= strs.length) {
            return 0;
        }
        if(dp[start] != -1) {
            return dp[start];
        }
        int[] count = countNoOf1sOs(strs[start]);

        if(m >= count[0] && n >= count[1]) {
            dp[start] = Math.max(findMaxForm(strs, start + 1, m , n , dp) , findMaxForm(strs, start + 1, m - count[0], n - count[1], dp) + 1);
        }
        else {
            dp[start] = findMaxForm(strs, start + 1, m , n , dp);
        }

        return dp[start];
    }


    public int[] countNoOf1sOs(String s) {

        int zeroes = 0;
        int ones = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '1') {
                ones++;
            }
            else {
                zeroes++;
            }
        }

        return new int[]{zeroes,ones};
    }

    public static void main(String[] args) {
        String[] input = new String[]{"10","0001","111001","1","0"};
        OnesAndZeroes474 obj = new OnesAndZeroes474();
        int i = obj.findMaxForm(input,4,3);
        i = 0;
    }
}
