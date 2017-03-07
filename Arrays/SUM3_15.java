package Arrays;

/**
 * Created by shubham.goyal on 3/7/17.
 */

import java.util.*;

public class SUM3_15 {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new LinkedList<>();
        if(nums.length < 3) {
            return result;
        }
        Arrays.sort(nums);
        int first = 0;
        while(first < nums.length - 2) {

            if(first > 0 && nums[first] == nums[first - 1]) {
                first++;
                continue;
            }
            int second = first + 1;
            int third = nums.length - 1;
            while(second < third) {
                int sum = nums[first] + nums[second] + nums[third];
                if(sum == 0) {
                    result.add(Arrays.asList(nums[first], nums[second], nums[third]));
                    second++;
                    third--;
                    while (second < third && nums[second] == nums[second - 1]) {
                        second++;
                    }
                    while (second < third && nums[third] == nums[third + 1]) {
                        third--;
                    }
                }
                else if(sum < 0) {
                    second++;
                }
                else {
                    third--;
                }
            }
            first++;
        }

        return result;
    }
}
