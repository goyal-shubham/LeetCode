package BitManipulation;

/**
 * Created by shubham.goyal on 2/15/17.
 */
public class PowerofTwo231 {
    public boolean isPowerOfTwo(int n) {

        if(n <= 0) {
            return false;
        }
        return (n & (n-1)) == 0;

    }
}
