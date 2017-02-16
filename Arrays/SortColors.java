package Arrays;

/**
 * Created by shubham.goyal on 2/12/17.
 */
public class SortColors {

    public void sortColors(int[] nums) {

        if(nums == null || nums.length == 0) {
            return;
        }

        int i = 0;
        int j = nums.length - 1;
        while(i < nums.length - 1 && nums[i] == 0) {
            i++;
        }
        while(j >= 0 && nums[j] == 2) {
            j--;
        }

        int counter = i;
        while(counter <= j && i <= j) {
            System.out.println(i + " " + j + " " + counter);

            if(nums[counter] == 0) {
                swap(nums, i , counter);
                while(i < nums.length - 1 && nums[i] == 0) {
                    i++;
                }
                counter++;
            }
            else if(nums[counter] == 2){
                swap(nums, j , counter);
                while(j >= 0 && nums[j] == 2) {
                    j--;
                }
            }
            // System.out.println(i + " " + j + " " + counter);
            else {
                counter++;
            }
        }
        int i1 = 0;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        SortColors obj = new SortColors();
        obj.sortColors(new int[]{2,0,0});
    }
}
