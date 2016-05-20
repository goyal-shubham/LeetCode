import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by shubhamgoyal on 5/19/16.
 */
public class InsertInterval57
{
    public List<Interval> insert(List<Interval> intervals, Interval newInterval)
    {
        if(intervals == null || intervals.size() <= 1)
        {
            return intervals;
        }

        List<Interval> result = new ArrayList<Interval>();

        for(Interval i : intervals)
        {
            if(i.end < newInterval.start)
            {
                result.add(i);
            }
            else if(i.start > newInterval.end)
            {
                result.add(newInterval);
                newInterval = i;
            }
            else if(i.end >= newInterval.start || i.start <= newInterval.end)
            {
                newInterval = new Interval(Math.min(i.start, newInterval.start), Math.max(i.end, newInterval.end));
            }

        }

        result.add(newInterval);
        return result;

    }

}

