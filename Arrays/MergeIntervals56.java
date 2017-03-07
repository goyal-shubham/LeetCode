package Arrays;

import java.util.*;

/**
 * Created by shubham.goyal on 2/20/17.
 */
public class MergeIntervals56 {


    public List<Interval> merge(List<Interval> intervals) {

        Collections.sort(intervals, new Comparator<Interval>(){

            @Override
            public int compare(Interval o1, Interval o2) {
                if(o1.start < o2.start) {
                    return -1;
                }
                else if(o1.start > o2.start){
                    return 1;
                }
                return 0;
            }
        });

        List<Interval> result = new LinkedList<>();

        int start = Integer.MIN_VALUE;
        int end = Integer.MIN_VALUE;

        for(Interval i : intervals) {
            if(end  > i.start) {
                end = Math.max(i.end, end);
            }else {
                if(start != Integer.MIN_VALUE) {
                    result.add(new Interval(start, end));
                }
                start = i.start;
                end = i.end;
            }
        }
        if(start != Integer.MIN_VALUE) {
            result.add(new Interval(start, end));
        }
        return result;
    }



    public static void main(String[] args) {
        List<Interval> intervals = new LinkedList<Interval>();
        Interval i1 = new Interval(100,110);
        Interval i2 = new Interval(20, 30);
        Interval i3 = new Interval(3,5);
        MergeIntervals56 obj=  new MergeIntervals56();
        intervals.add(i1);
        intervals.add(i2);
        intervals.add(i3);
        obj.merge(intervals);
    }
}

class Interval {
    int start;
    int end;

    Interval() {
        start = 0;
        end = 0;
    }

    Interval(int s, int e) {
        start = s;
        end = e;
    }
}
