package Arrays;

/**
 * Created by shubham.goyal on 1/29/17.
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int currentIndex = m + n - 1;
        int i, j;
        for(i = m - 1, j = n - 1; i >= 0 && j >= 0; ){

            if(nums1[i] >= nums2[j]) {
                nums1[currentIndex--] = nums1[i--];
            }
            else {
                nums1[currentIndex--] = nums2[j--];
            }
        }

        if(i < 0) {
            for(; j >=0 ; j--){
                nums1[currentIndex--] = nums2[j];
            }
        }
    }
}
