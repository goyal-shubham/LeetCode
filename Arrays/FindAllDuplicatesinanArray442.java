package Arrays;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by shubham.goyal on 1/28/17.
 */
public class FindAllDuplicatesinanArray442 {
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> result = new LinkedList<>();
        if(nums == null || nums.length == 0) {
            return result;
        }

        for(int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0) {
                result.add(index + 1);
            }
            else {
                nums[index] = -nums[index];
            }
        }

        return result;
    }
}
