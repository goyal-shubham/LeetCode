package String;

/**
 * Created by shubham.goyal on 1/23/17.
 */
public class MagicalString481 {
    public static int magicalString(int n) {
        int[] ms = new int[n + 1];
        int[] ss = new int[n + 1];
        if(n == 0) {
            return 0;
        }
        if( n <= 3) {
            return 1;
        }
        ms[0] = 1; ms[1] = 2; ms[2] = 2;
        ss[0] = 1; ss[1] = 2;
        int tail1 = 3;
        int tail2 = 2;
        int result = 1;

        int current = 2;
        int next = 1;

        while(tail1 < n ) {

            ss[tail2] = ms[tail2];
            for(int i = 0; i < ss[tail2] && tail1 < n; i++) {
                ms[tail1] = next;
                if(next == 1) {
                    result++;
                }
                tail1++;
            }
            next = next ^ 3;
            tail2++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(magicalString(7));
    }
}
