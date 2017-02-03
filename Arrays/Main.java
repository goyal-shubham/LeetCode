package Arrays;

/**
 * Created by shubham.goyal on 1/31/17.
 */
public class Main {



    public static void main(String[] args) {

        KthLargestElementinanArray obj = new KthLargestElementinanArray();
        int[] nums = new int[]{1,5,6,2,3,7,8,4};
        System.out.println(obj.findKthLargest(nums, 4));
    }
}
