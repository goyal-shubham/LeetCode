package Arrays;

import java.util.*;
/**
 * Created by shubham.goyal on 2/15/17.
 */
public class WiggleSortII324 {

    public void wiggleSort(int[] nums) {

        if(nums == null) {
            return;
        }

        Arrays.sort(nums);

        int n = nums.length;
        int[] result = new int[n];
        int middle = (n + 1) / 2;
        int i = 0;
        int j = middle - 1;
        int temp = middle;
        middle = n;
        while(temp != middle) {
            result[i++] = nums[j--];
            result[i++] = nums[middle - 1];
            middle--;
        }
        if(n % 2 == 1) {
            result[i] = nums[j];
        }

        for(i = 0; i < n; i++) {
            nums[i] = result[i];
        }
    }
}
