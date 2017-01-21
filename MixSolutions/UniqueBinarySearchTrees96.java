package MixSolutions;

/**
 * Created by shubhamgoyal on 4/15/16.
 */
public class UniqueBinarySearchTrees96 {

    int[] data = new int[100];

    public int numTrees(int n) {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        int result = 1;
        for(int i = 1; i <= n; i++)
        {
            result += Math.max(1, numTrees(i - 1)) * Math.max(1 , numTrees(n - i));
        }
        data[n] = result;
        return result;
    }
}
