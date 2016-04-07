import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by shubhamgoyal on 4/5/16.
 */
public class ContainsDuplicateII219 {

    //Using Set
    public boolean containsNearbyDuplicateSet(int[] nums, int k) {
        HashSet<Integer> mySet = new HashSet<>();
        for(int i = 0 ; i < nums.length; i++)
        {
            if(!mySet.add(nums[i]))
            {
                return true;
            }
            if(mySet.size() > k)
            {
                mySet.remove(nums[i - k]);
            }

        }
        return false;
    }
        //Using Map
    public boolean containsNearbyDuplicateMap(int[] nums, int k) {

        HashMap<Integer, Integer> myMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(myMap.containsKey(nums[i]) && (i - myMap.get(nums[i])) <= k)
            {
                return true;
            }
            myMap.put(nums[i], i);
        }
        return false;
    }
}
