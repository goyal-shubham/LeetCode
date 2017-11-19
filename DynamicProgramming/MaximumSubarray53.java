package DynamicProgramming;

/**
 * Created by shubham.goyal on 2/15/17.
 */
public class MaximumSubarray53 {
    public int maxSubArray(int[] nums) {

        int totalMaximum = nums[0] ;
        int maximumUptoHere = nums[0];

        for(int i = 1; i < nums.length; i++) {

            maximumUptoHere = Math.max(maximumUptoHere + nums[i], nums[i]);
            totalMaximum = Math.max(totalMaximum, maximumUptoHere);
        }

        return totalMaximum;

    }
}
