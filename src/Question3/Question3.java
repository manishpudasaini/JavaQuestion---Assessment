package Question3;

import java.util.ArrayList;
import java.util.List;
public class Question3 {
    public int[][] finalIntervalSolve(int[][] intervals) {
        List<int[]> intervalList = new ArrayList<>(); // To store the merged intervals

        // adding the first interval to list
        intervalList.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int[] current = intervals[i]; // Current interval
            int[] last = intervalList.get(intervalList.size() - 1);


            if (current[0] <= last[1]) {
                last[1] = Math.max(last[1], current[1]);
                intervalList.set(intervalList.size() - 1, last);
            } else {

                intervalList.add(current);
            }
        }
        // Convert the list  to a 2D array and return
        int[][] twoDArray = new int[intervalList.size()][];
        return intervalList.toArray(twoDArray);
    }

}
