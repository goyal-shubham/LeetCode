package Sorting;

/**
 * Created by shubham.goyal on 1/30/17.
 */
public class SelectionSort extends SortInterface {


    @Override
    public void sort(int[] data) {

        for(int i =  0; i < data.length - 1; i++) {

            int min = i;
            for(int j = i + 1; j < data.length; j++) {
                if(data[j] < data[min]) {
                    min = j;
                }
            }

            swap(data, i , min);


        }

    }
}
