package MixSolutions;

import java.util.*;

/**
 * Created by shubham.goyal on 12/12/16.
 */
public class TopKFrequentElements347 {

        public static List<Integer> topKFrequent(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int n: nums){
                if(!map.containsKey(n)) map.put(n,1);
                else map.put(n, map.get(n)+1);
            }

            PriorityQueue<Integer> topN = new PriorityQueue<Integer>(k);

            for(Integer key : map.keySet()){
                if (topN.size() < k)
                    topN.add(key);
                else if (map.get(topN.peek()) < map.get(key)) {
                    topN.poll();
                    topN.add(key);
                }
            }
            return (List) Arrays.asList(topN.toArray());
        }

    public static void main(String[] args) {
        int[] data = {5,2,5,3,5,3,1,1,3,3,4,5,6,4,2,4,2,2,3,4,2};
        int k = 3;
        System.out.println(topKFrequent(data, 4));

}
    }
