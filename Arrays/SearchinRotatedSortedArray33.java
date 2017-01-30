package Arrays;

/**
 * Created by shubham.goyal on 1/26/17.
 */
public class SearchinRotatedSortedArray33 {

    public int search(int[] nums, int target) {

        if(nums == null || nums.length == 1 && target != nums[0]) {
            return -1;
        }

        int start = 0;
        int end = nums.length - 1;

        while(start < end){
            int mid = ( start + end ) / 2;

            if(nums[mid] == target) {
                return mid;
            }

            if(nums[mid] <= nums[end]) {
                if(target >= nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }

            if(nums[mid] >= nums[start]) {
                if(target >= nums[start] && target <= nums[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }


    public static void main(String[] args) {

        String s = "shubham";
        String n = "10019&";

        for(int i = 0 ; i < 3; i++) {
            System.out.println(s.charAt(i) + "   " + n.charAt(i));
        }
    }

}
