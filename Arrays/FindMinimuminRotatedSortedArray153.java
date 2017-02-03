package Arrays;

/**
 * Created by shubham.goyal on 1/28/17.
 */
public class FindMinimuminRotatedSortedArray153 {

    public int findMin(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while(start != end) {

            int mid = (end  + start)/2 + 1;
            if(mid > 0 && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }
            if(nums[mid] > nums[end] ) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return nums[start];

    }
}
