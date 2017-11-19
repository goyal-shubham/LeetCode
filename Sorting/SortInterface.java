package Sorting;

/**
 * Created by shubham.goyal on 1/30/17.
 */
public abstract class SortInterface {

    public void sort(int[] data) {

    }


    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
