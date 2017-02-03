package Arrays;

/**
 * Created by shubham.goyal on 1/31/17.
 */
public class FindMinimuminRotatedSortedArrayII154 {


    //Solution 2
    public int findMin1(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {

            int mid = (end + start) / 2 + 1;
            if (mid > 0 && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else if (nums[mid] < nums[end]) {
                end = mid - 1;
            } else {
                if (nums[start] == nums[mid]) {
                    start++;
                    end--;
                } else {
                    end = mid - 1;
                }
            }
        }

        return nums[start];
    }


    public int findMin(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while(start < end) {

            int mid = (end  + start)/2 + 1;
            if(mid > 0 && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }
            if(nums[mid] > nums[end] ) {
                start = mid + 1;
            }
            else if(nums[mid] < nums[end]) {
                end = mid - 1;
            }
            else {
                end--;
            }
        }

        return nums[start];

    }

}
