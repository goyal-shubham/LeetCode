package Tree;

/**
 * Created by shubham.goyal on 2/7/17.
 */
public class UniqueBinarySearchTree96 {

    public int numTrees(int n) {
        int[] result = new int[n + 1];
        result[0] = 1;
        result[1] = 1;
        for(int i = 2; i <= n; i++){
            int current = 0;
            for(int j = 0; j < i; j++) {
                current += (result[j] * result[i-j-1]);
            }
            result[i] = current;
        }

        return result[n];
    }


    public static void main(String[] args) {
        UniqueBinarySearchTree96 obj = new UniqueBinarySearchTree96();
        System.out.println(obj.numTrees(10));
    }
}
