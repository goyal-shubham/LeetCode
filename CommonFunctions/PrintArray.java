package CommonFunctions;

/**
 * Created by shubham.goyal on 2/15/17.
 */
public class PrintArray {

    public static void printArray(int[] dp) {
        for(int i : dp) {
            System.out.println(i);
        }
        System.out.println("done");
    }

    public static void printArray(int[][] data) {
       for(int i = 0 ; i < data.length; i++){
           for(int j = 0; j < data[0].length; j++){
               System.out.println(i);
           }
           System.out.println("done");
       }
    }
}
