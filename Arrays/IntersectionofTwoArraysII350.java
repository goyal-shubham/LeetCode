package Arrays;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by shubham.goyal on 1/29/17.
 */
public class IntersectionofTwoArraysII350 {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map1 = new HashMap<>();
        for(int i : nums1) {

            map1.put(i , map1.getOrDefault(i,0) + 1);
        }

        List<Integer> resultList = new LinkedList<>();

        for(int i : nums2) {

            if(map1.containsKey(i) && map1.get(i) > 0) {
                resultList.add(i);
                map1.put(i, map1.get(i) - 1);
            }
        }

        int[] result = new int[resultList.size()];
        int index = 0;
        for(int i : resultList) {
            result[index++] = i;
        }

        return result;
    }
}
