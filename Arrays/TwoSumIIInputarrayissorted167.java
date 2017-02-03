package Arrays;

/**
 * Created by shubham.goyal on 1/31/17.
 */
public class TwoSumIIInputarrayissorted167 {
    public int[] twoSum(int[] nums, int target) {

        int index1 = 0;
        int index2 = nums.length - 1;
        while(index1 < index2) {
            if(nums[index1] + nums[index2] == target) {
                break;
            }
            else if(nums[index1] + nums[index2] < target) {
                index1++;
            }
            else {
                index2--;
            }
        }

        return new int[]{index1 + 1, index2 + 1};

    }
}
