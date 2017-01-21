package MixSolutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by shubhamgoyal on 4/5/16.
 */
public class ContainsDuplicate217 {

    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Boolean> myMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(myMap.containsKey(nums[i]))
            {
                return true;
            }
            myMap.put(nums[i], false);
        }
        return false ;
    }

    //using sets
    public boolean containsDuplicate2(int[] nums) {

        HashSet mySet = new HashSet();
        for(int i = 0; i < nums.length; i++)
        {
            if(mySet.contains(nums[i]))
            {
                return true;
            }
            mySet.add(nums[i]);
        }
        return false ;
    }


    //Using Sorting
    public boolean containsDuplicate3(int[] nums) {

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 1; i++)
        {
           if(nums[i] == nums[i + 1])
           {
               return true;
           }
        }
        return false ;
    }
}
