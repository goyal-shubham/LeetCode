package Arrays;

/**
 * Created by shubham.goyal on 2/16/17.
 */
public class ContainerWithMostWater11 {

    public int maxArea(int[] height) {

        int result = 0;
        int start = 0;
        int end = height.length - 1;
        while(start < end) {

            int area = (end - start) * Math.min(height[start] , height[end]);
            if(area > result) {
                result = area;
            }

            if(height[start] < height[end]) {
                start++;
            }
            else {
                end--;
            }

        }
        return result;
    }
}
