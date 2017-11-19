package Sorting;

/**
 * Created by shubham.goyal on 1/30/17.
 */
public class Main {

    public static void printArray(int[] data) {
        for(int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {


        int[] data1 = {3,2,1,4,2,4,5,7,10,-1,3,-3,4,5,6};

        printArray(data1);


//        InsertionSort is = new InsertionSort();
//        is.sort(data1);
//        printArray(data1);

//        SelectionSort ss = new SelectionSort();
//        ss.sort(data1);
//        printArray(data1);

        BubbleSort bs = new BubbleSort();
        bs.sort(data1);
        printArray(data1);
    }
}
