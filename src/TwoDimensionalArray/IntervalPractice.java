package TwoDimensionalArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntervalPractice {
    public static int[] merge(int[] left, int[] right) {
        return new int[] {left[0], right[1]};
    }
    public static void main(String[] args) {
        List<int[]> intervals = new ArrayList<>();
        List<int[]> mergedIntervals = new ArrayList<>();
        int[] first = {1,3};
        intervals.add(first);
        intervals.add(new int[] {2,6});
        intervals.add(new int[] {8,10});
        intervals.add(new int[] {15,18});
        intervals.add(new int[] {17, 31});
        int nextIntervalIndex = 0;
        for(int i=0; i<intervals.size(); i++) {
            int[] leftArr = intervals.get(i);
            int[] rightArr = null;
            try {
                nextIntervalIndex = i+1;
                rightArr = intervals.get(nextIntervalIndex);
            }catch (Exception e) {
// last element add directly
                mergedIntervals.add(leftArr);
                break;
            }
            if(leftArr[1] >= rightArr[0]) {
                mergedIntervals.add(merge(leftArr, rightArr));
// [] + [] so skip one
                i++;
            } else {
                mergedIntervals.add(leftArr);
            }
        }
        mergedIntervals.stream().map(intArr ->
                Arrays.toString(intArr) ).forEach(System.out::println);
    }

}
