package Arrays;

import CommonFunctions.PrintArray;

/**
 * Created by shubham.goyal on 1/31/17.
 */
public class KthLargestElementinanArray {



    public int partition(int[] nums, int start, int end) {

        int pivotValue = nums[end];

        int swapPosition = start;

        for(int i = start; i < end - 1; i++) {

            if(nums[i] < pivotValue) {
                int temp = nums[i];
                nums[i] = nums[swapPosition];
                nums[swapPosition++] = temp;
            }

        }

        int temp = nums[end];
        nums[end] = nums[swapPosition];
        nums[swapPosition] = temp;

        return swapPosition;

    }

    public int findKthLargest(int[] nums, int k) {

        int start = 0;
        int end = nums.length - 1;

        while(start < end) {

            int currentIndex = partition(nums, start, end);
            if(currentIndex == k) {
                return nums[currentIndex];
            }
            else if(currentIndex < k) {
                start = currentIndex + 1;
            }
            else {
                end = currentIndex - 1;
            }

            PrintArray.printArray(nums);

        }

        return nums[end];
    }


}
