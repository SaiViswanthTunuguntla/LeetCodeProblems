package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    //https://leetcode.com/problems/merge-intervals/
    //TC: O(nlogn).
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1) return intervals;
        Arrays.sort(intervals,(row1, row2)->Integer.compare(row1[0],row2[0]));

        List<int[]> res= new ArrayList<>();
        int[] current= intervals[0];
        res.add(current);

        for(int[] interval:intervals)
        {
            int curr_begin= current[0];
            int curr_end= current[1];
            int next_begin= interval[0];
            int next_end= interval[1];

            if(curr_end>=next_begin)
            {
                current[1]=Math.max(curr_end,next_end);
            }
            else
            {
                current=interval;
                res.add(current);
            }
        }

        return res.toArray(new int[res.size()][]);

    }
}
