package Arrays;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by shubham.goyal on 1/29/17.
 */
public class IntersectionofTwoArrays349 {

    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> mySet = new HashSet<>();
        Set<Integer> myList = new HashSet<>();

        for(int i : nums1) {
            mySet.add(i);
        }

        for(int i : nums2) {
            if(mySet.contains(i)) {
                myList.add(i);
            }
        }

        int[] result = new int[myList.size()];
        int index = 0;
        for(int i : myList) {
            result[index++] = i;
        }

        return result;
    }
}
