package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by shubham.goyal on 2/22/17.
 */
public class BeautifulArrangements526 {

    int result;
    List<int[]> solution;
      public int countArrangement(int N) {

          solution = new ArrayList<int[]>();
        result = 0;
        int[] input = new int[N];
        for(int i = 0; i < N; i++) {
            input[i] = i + 1;
        }
        countArrangement(input, 0);
        return result;
    }

    public void countArrangement(int[] input, int start) {
        if(start >= input.length) {
            solution.add(input.clone());
            result++;
            return;
        }

        for(int i = start; i < input.length; i++) {

            swap(input, start , i);
            if((input[start] % (start + 1) == 0 || (start + 1) % input[start] == 0)) {
                countArrangement(input, start + 1);
            }
            swap(input, start, i);
        }


    }

    public void swap(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }

    public static void main(String[] args) {
        BeautifulArrangements526 obj = new BeautifulArrangements526();
        obj.countArrangement(6);
    }
}
