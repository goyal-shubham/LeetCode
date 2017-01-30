package Arrays;

/**
 * Created by shubham.goyal on 1/28/17.
 */
public class FirstMissingPositive41 {
    public int firstMissingPositive(int[] nums) {

        int n = nums.length;
        int i = 0;
        while(i < n) {
            if(nums[i] == i + 1 || nums[i] <= 0 || nums[i] > n) {
                i++;
            }
            else if(nums[nums[i] - 1] != nums[i]) {
                swap(nums , i , nums[i] - 1);
            }
            else {
                i++;
            }
        }


        for(i = 0; i < n; i++) {
            if(nums[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;

    }

    public void swap(int[] A, int i , int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
