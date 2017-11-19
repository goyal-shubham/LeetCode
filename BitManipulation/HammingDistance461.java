package BitManipulation;

/**
 * Created by shubham.goyal on 2/18/17.
 */
public class HammingDistance461 {
    public static int hammingDistance(int x, int y) {

        int num = x ^ y;
        int result = 0;
        while(num != 0) {
            num = num & (num - 1);
            result++;
        }

        return result;
    }


    public static void main(String[] args) {
        hammingDistance(1,4);
    }
}
