package Arrays;

/**
 * Created by shubham.goyal on 2/15/17.
 */
public class RemoveElements27 {

    public int removeElement(int[] nums, int val) {

        int currentIndex = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[currentIndex++] = nums[i];
            }
        }
        return currentIndex;
    }
}
