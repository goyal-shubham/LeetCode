import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by shubhamgoyal on 5/19/16.
 */
public class MergeIntervals56
{

    public List<Interval> merge(List<Interval> intervals)
    {
        if(intervals == null || intervals.size() <= 1)
        {
            return intervals;
        }

        List<Interval> result = new ArrayList<Interval>();

        Collections.sort(intervals, new IntervalComparator());

        Interval previous = intervals.get(0);
        for(int i = 1; i < intervals.size(); i++)
        {
            Interval current = intervals.get(i);
            if(previous.end >= current.start)
            {
                Interval newInterval = new Interval(previous.start, Math.max(previous.end, current.end));
                previous = newInterval;
            }
            else
            {
                result.add(previous);
                previous = current;
            }
        }

        result.add(previous);

        return result;

    }

}

class IntervalComparator implements Comparator<Interval>
{

    @Override public int compare(Interval o1, Interval o2)
    {
        return o1.start - o2.start;
    }
}

class Interval
{
    int start;
    int end;

    Interval()
    {
        start = 0;
        end = 0;
    }

    Interval(int s, int e)
    {
        start = s;
        end = e;
    }
}
