package MixSolutions;

/**
 * Created by shubhamgoyal on 3/30/16.
 */

public class NimGame292 {

    public boolean canWinNim(int n) {

        if(n % 4 == 0)
        {
            return false;
        }

        return true;
    }
}