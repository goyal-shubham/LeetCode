package Arrays;

/**
 * Created by shubham.goyal on 2/15/17.
 */
public class MoveZeroes283 {

    public void moveZeroes(int[] nums) {

        int currentIndex = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[currentIndex];
                nums[currentIndex++] = nums[i];
                nums[i] = temp;
            }
        }
    }
}
