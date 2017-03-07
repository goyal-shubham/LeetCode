package Arrays;

/**
 * Created by shubham.goyal on 3/7/17.
 */

import java.util.*;

public class Sum4_18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> result = new LinkedList<>();
        if(nums.length < 4) {
            return result;
        }
        Arrays.sort(nums);
        int first = 0;
        int len = nums.length;
        while(first < len - 3){
            int second = first + 1;
            if(first > 0 && nums[first] == nums[first - 1]){
                first++;
                continue;
            }
            while(second < len - 2) {

                if(second > first + 1 && nums[second] == nums[second - 1]){
                    second++;
                    continue;
                }
                int third = second + 1;
                int fourth = len - 1;
                while(third < fourth) {

                    int sum = nums[first] + nums[second] + nums[third] + nums[fourth];

                    if(sum == target) {
                        result.add(Arrays.asList(nums[first], nums[second], nums[third], nums[fourth]));
                        third++;
                        fourth--;
                        while(third < fourth && nums[third] == nums[third - 1]) {
                            third++;
                        }
                        while(third < fourth && nums[fourth] == nums[fourth + 1]) {
                            fourth--;
                        }
                    }
                    else if(sum > target) {
                        fourth--;
                    }
                    else {
                        third++;
                    }
                }

                second++;

            }
            first++;

        }
        return result;

    }
}
