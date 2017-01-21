package MixSolutions;

/**
 * Created by shubhamgoyal on 3/30/16.
 */
public class AddDigits258 {

    public int addDigits(int num) {
        if(num == 0)
        {
            return 0;
        }

        if(num % 9 == 0)
        {
            return 9;
        }

        return num % 9;
    }
}
