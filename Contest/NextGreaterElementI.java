package Contest;

import java.util.Arrays;

/**
 * Created by shubham.goyal on 2/4/17.
 */
public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {

        int[] result = new int[findNums.length];
        for(int i = 0; i < findNums.length; i++) {

            int answer = -1;
            int j = 0;
            for(j = 0; j < nums.length; j++) {
                if(nums[j] == findNums[i]) {
                    while(j < nums.length && nums[j] <= findNums[i]) {
                        j++;
                    }
                    if(j < nums.length && nums[j] > findNums[i]) {
                        answer = nums[j];
                    }
                    break;
                }
            }



            result[i] = answer;
        }

        return result;
    }

    public String[] findRelativeRanks(int[] nums) {
        {
            String[] result = new String[nums.length];
            int[] rank = new int[nums.length];

            for (int i = 0; i < nums.length; i++) {
                int increment = 0;
                for (int j = 0; j < i; j++) {
                    if (nums[j] < nums[i]) {
                        rank[j]++;
                        increment++;
                    }
                }

                rank[i] = i - increment;
            }

            String top = "Gold Medal";
            String second = "Silver Medal";
            String third = "Bronze Medal";

            for (int i = 0; i < nums.length; i++) {
                String current = "";
                switch (i) {
                    case 0:
                        current = top;
                        break;
                    case 1:
                        current = second;
                        break;
                    case 2:
                        current = third;
                        break;
                    default:
                        current = i + "";
                        break;
                }
                result[i] = current;

            }
            return result;
        }
    }


    int currentIndex;
    public int[] findDiagonalOrder(int[][] matrix) {

        if(matrix.length == 0) {
            return  new int[0];
        }
        int[] result = new int[matrix.length * matrix[0].length];

        currentIndex = 0;
        int c = 0;
        int count = matrix.length + matrix[0].length -1;
        int i = 0, j = 0;
        boolean reverse = false;
        while (c < count) {

            printDiagonal(i, j, matrix , result, reverse);

            if (i < matrix.length -1) {
                i++;
            }
            else if (j < matrix[0].length - 1) {
                j++;
            }
            reverse = reverse ? false : true;
            c++;
        }
        return result;
    }

    private void printDiagonal(int i, int j, int[][] m, int[] result, boolean reverse) {
        int startIndex = currentIndex;
        while (i >= 0 && j < m[0].length ) {
            result[currentIndex] = m[i][j];
            i--;
            j++;
            currentIndex++;
        }

        if(reverse) {
            reverseArray(result, startIndex);
        }
    }

    private void reverseArray(int[] result, int startIndex){

        int tempIndex = currentIndex - 1;
        for(int i = startIndex; i < (currentIndex + startIndex ) / 2; i++){
            int temp = result[i];
            result[i] = result[tempIndex];
            result[tempIndex] = temp;
            tempIndex--;
        }
    }

    public static void main(String[] args) {
        NextGreaterElementI obj = new NextGreaterElementI();

        int[] result = obj.findDiagonalOrder(new int[][] {{1,2,3,4}, {5,6,7,8},{9,10,11,12},{13,14,15,16}});

        for(int i : result) {
            System.out.print(i + " ");
        }
    }


}
