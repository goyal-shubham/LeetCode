package MixSolutions;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by shubhamgoyal on 4/5/16.
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

 You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class MajorityElement169 {

    //Using Sorting
    public int majorityElement1(int[] nums)
    {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    //Using Maps
    public int majorityElement2(int[] nums) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        int result = nums[0];
        for(int i = 0 ; i < nums.length; i++)
        {
            if(myMap.containsKey(nums[i]))
            {
                myMap.put(nums[i] , myMap.get(nums[i]) + 1);
                if(myMap.get(nums[i]) > nums.length / 2)
                {
                    result = nums[i];
                    break;
                }
            }
            else
            {
                myMap.put(nums[i], 1);
            }
        }
        return result;

    }

    //Internet "Majority Vote method"

    public int majorityElement(int[] nums)
    {
        int result = 0;
        int count = 0;
        for(int i = 0 ; i < nums.length; i++)
        {
            if( count == 0)
            {
                result = nums[i];
            }
            if( nums[i] == result)
            {
                count++;
            }
            else
            {
                count-- ;
            }
        }
        return  result;
    }


}
