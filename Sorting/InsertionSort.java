package Sorting;

/**
 * Created by shubham.goyal on 1/30/17.
 */
public class InsertionSort extends SortInterface {



    @Override
    public void sort(int[] nums) {

        for(int i = 1; i < nums.length; i++) {

            for(int j = i - 1; j >= 0; j--) {

                if(nums[j] > nums[j + 1]) {
                    swap(nums, j , j+1);
                }

            }

        }

    }
}
