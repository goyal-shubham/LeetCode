package Arrays;

/**
 * Created by shubham.goyal on 2/16/17.
 */
public class TrappingRainWater42 {

    public int trap(int[] height) {

        int n = height.length;
        if(n == 0) {
            return 0;
        }
        int start = 0;
        int end = n - 1;
        int total = 0;

        while (start < n && height[start] == 0 ) {
            start++;
        }

        while(end >= 0  && height[end] == 0) {
            end--;
        }

        int maxValue = 0;
        while(start <= end) {

            int currentMaxValue = Math.min(height[start], height[end]);
            if(currentMaxValue > maxValue) {
                total += (end - start + 1) * (currentMaxValue - maxValue);
                maxValue = currentMaxValue;
            }
            if(height[start] > height[end]) {
                total -= height[end] ;
                end--;
            }
            else {
                total -= height[start];
                start++;
            }

        }

        return total;

    }
}
