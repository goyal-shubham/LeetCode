package Arrays;

/**
 * Created by shubham.goyal on 2/15/17.
 */
public class MajorityElement169 {

    public int majorityElement(int[] nums) {

        int currentCandidate = 0;
        int count = 0;

        for(int i : nums) {

            if(count == 0) {
                currentCandidate = i;
            }

            if(i == currentCandidate) {
                count++;
            }
            else {
                count--;
            }

        }

        return currentCandidate;
    }
}
