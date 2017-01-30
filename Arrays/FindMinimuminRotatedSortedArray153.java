package Arrays;

/**
 * Created by shubham.goyal on 1/28/17.
 */
public class FindMinimuminRotatedSortedArray153 {

    public int findMin(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while(start != end) {

            int mid = start + (end - start)/2;
            if(mid > 0 && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }
            if(nums[mid] > nums[end] && nums[mid] >= nums[start]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return nums[start];

    }
}
