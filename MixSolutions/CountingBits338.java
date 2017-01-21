package MixSolutions;

/**
 * Created by shubhamgoyal on 4/21/16.
 */
public class CountingBits338 {

    public int[] countBits(int num) {

        int[] result = new int[num + 1];
        int current = 1;

        int offset = 1;
        for(int i = 1; i <= num; i++)
        {
            if(i == current)
            {
                result[i] = 1;
                offset = current;
                current *= 2;
            }
            else
            {
                result[i] = 1 + result[i - offset];
            }
        }

        return result;
    }
}
