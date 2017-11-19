package DynamicProgramming.Greedy;

/**
 * Created by shubham.goyal on 2/15/17.
 */
public class JumpGame {

    public boolean canJump(int[] nums) {

        if(nums == null || nums.length == 1) {
            return true;
        }
        int n = nums.length;
        int last = n - 1;
        for(int i = n - 2; i >= 0; i--){
            if( i + nums[i] >= last) {
                last=i;
            }
        }
        return last == 0;

    }
}
