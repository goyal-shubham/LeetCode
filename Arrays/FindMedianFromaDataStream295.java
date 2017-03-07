package Arrays;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by shubham.goyal on 2/16/17.
 */
public class FindMedianFromaDataStream295 {

    public class MedianFinder {

        PriorityQueue<Integer> minHeap;
        PriorityQueue<Integer> maxHeap;

        /** initialize your data structure here. */
        public MedianFinder() {

            minHeap = new PriorityQueue<>();
            maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer x, Integer y) {
                    if (x < y) return 1;
                    if (x > y) return -1;
                    return 0;
                }
            });
        }

        public void addNum(int num) {
            maxHeap.add(num);
            minHeap.add(maxHeap.poll());

            if (maxHeap.size() < minHeap.size()) {                     // maintain size property
                maxHeap.add(minHeap.poll());
            }

        }

        public double findMedian() {
            return maxHeap.size() > minHeap.size() ? (double ) maxHeap.peek() :( maxHeap.peek() + minHeap.peek() ) * 0.5;
        }
    }

}
