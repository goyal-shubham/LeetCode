package Arrays;

/**
 * Created by shubham.goyal on 3/7/17.
 */

import java.util.*;
public class Sum4II454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int n = A.length;
        if(n == 0) {
            return 0;
        }

        int[] sum1 = new int[n * n];
        int index = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                sum1[index] = A[i] + B[j];
                index++;
            }
        }

        int[] sum2 = new int[n * n];
        index = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                sum2[index] = C[i] + D[j];
                index++;
            }
        }

        Arrays.sort(sum1);
        Arrays.sort(sum2);
        int i = 0;
        int j = sum2.length - 1;
        int result = 0;
        while(i < sum1.length && j >= 0) {

            int s1 = sum1[i];
            int s2 = sum2[j];
            int sum = s1 + s2;
            if(sum == 0) {

                int count1 = 0;
                int count2 = 0;
                while(i < sum1.length && sum1[i] == s1){
                    i++;
                    count1++;
                }
                while(j >= 0 && sum2[j] == s2){
                    j--;
                    count2++;
                }
                result += (count1 * count2);
            }
            else if(sum < 0) {
                i++;
            }
            else {
                j--;
            }

        }
        return result;
    }
}
