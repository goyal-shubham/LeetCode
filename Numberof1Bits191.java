/**
 * Created by shubhamgoyal on 4/21/16.
 */
public class Numberof1Bits191 {

    int n = 11;
    public int hammingWeight(int n) {

        int a = n;
        int count = 0;
        while(a != 0)
        {
            if((a & 1) == 1)
            {
                count++;
            }
            a>>>=1;
        }
        return count;

    }

}
