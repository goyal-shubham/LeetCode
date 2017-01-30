package Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shubham.goyal on 1/28/17.
 */
public class FindAllNumbersDisappearedinanArray448 {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] > 0 ){
                nums[index] =  - nums[index];
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }
}
