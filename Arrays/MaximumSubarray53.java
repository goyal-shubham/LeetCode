package Arrays;

/**
 * Created by shubham.goyal on 1/26/17.
 */
public class MaximumSubarray53 {

    public int maxSubArray(int[] nums) {

        int totalMaximum = 0 ;
        int maximumUptoHere = 0;

        for(int i = 0; i < nums.length; i++) {

            maximumUptoHere = Math.max(maximumUptoHere + nums[i], nums[i]);
            totalMaximum = Math.max(totalMaximum, maximumUptoHere);
        }

        return totalMaximum;

    }
}
