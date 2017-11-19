package Sorting;

/**
 * Created by shubham.goyal on 1/30/17.
 */
public class BubbleSort extends SortInterface {

    @Override
    public void sort(int[] data) {

        for(int i = data.length - 1; i >= 0; i--) {

            for(int j = 1; j <= i ; j++) {
                if(data[j] < data[j - 1]) {
                    swap(data, j, j - 1);
                }
            }
        }
    }
}
