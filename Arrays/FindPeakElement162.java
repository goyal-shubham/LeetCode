package Arrays;

/**
 * Created by shubham.goyal on 3/7/17.
 */
public class FindPeakElement162 {

    public int findPeakElement(int[] nums) {

        int first = Integer.MIN_VALUE;
        if(nums.length == 0) {
            return 0;
        }

        int i = 0;
        boolean isFound = true;
        while(i < nums.length) {

            int last = Integer.MIN_VALUE;
            if(i != nums.length - 1) {
                last = nums[i + 1];
            }

            if(nums[i] > first && nums[i] > last) {
                i++;
                break;
            }

            first = nums[i];
            i++;
        }

        return i-1;
    }
}
