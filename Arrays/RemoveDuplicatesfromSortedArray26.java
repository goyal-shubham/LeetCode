package Arrays;

/**
 * Created by shubham.goyal on 1/26/17.
 */
public class RemoveDuplicatesfromSortedArray26 {

    public int removeDuplicates(int[] nums) {

        if(nums == null || nums.length == 0) {
            return 0;
        }

        int currentValue = nums[0];
        int result = 1;
        int index = 0;

        for(int i = 1; i  < nums.length; i++) {

            if(nums[i] == currentValue) {
                continue;
            }

            nums[index++ + 1] = nums[i];
            currentValue = nums[i];
            result++;
        }

        return result;
    }
}
