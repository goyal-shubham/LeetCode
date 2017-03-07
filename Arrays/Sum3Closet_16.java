package Arrays;

/**
 * Created by shubham.goyal on 3/7/17.
 */

import java.util.*;
public class Sum3Closet_16 {

    public int threeSumClosest(int[] nums, int target) {

        int result = 0;
        if(nums.length < 3) {
            return result;
        }
        int first = 0;
        int oldDiff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        while(first < nums.length - 2) {

            int second = first + 1;
            int third = nums.length - 1;
            while(second < third) {

                int sum = nums[first] + nums[second] + nums[third];
                int diff = Math.abs(sum - target);
                if(diff == 0) {
                    return sum;
                }
                if(sum > target) {
                    third--;
                }
                else {
                    second++;
                }

                if(diff < oldDiff) {
                    result = sum;
                    oldDiff = diff;
                }
            }

            first++;


        }

        return result;
    }
}
