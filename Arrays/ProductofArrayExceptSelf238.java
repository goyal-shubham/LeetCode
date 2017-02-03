package Arrays;

/**
 * Created by shubham.goyal on 2/2/17.
 */
public class ProductofArrayExceptSelf238 {

    public int[] productExceptSelf(int[] nums) {

        if(nums.length <= 1) {
            return nums;
        }

        int[] result = new int[nums.length];
        result[0] = 1;
        // Idea is to product the numbers in left side of array in one loop and the other side in the second loop.
        int leftProduct = 1;
        for(int i = 1; i < nums.length; i++) {
            result[i] = nums[i - 1] * leftProduct;
            leftProduct = result[i];
        }

        int rightProduct = 1;
        for(int i = nums.length - 1; i >= 0; i++) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }


        return result;

    }
}
