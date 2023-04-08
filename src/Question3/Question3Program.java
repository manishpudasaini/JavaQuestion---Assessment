package Question3;

import java.util.Arrays;

public class Question3Program {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        Question3 question3 = new Question3();
        int[][] finalIntervals = question3.finalIntervalSolve(intervals);

        System.out.println();
        System.out.println("<------------------------------------------------------>");
        System.out.println("Collection of the non-overlapping intervals are :: ");
        // Print the merged intervals
        for (int i = 0; i < finalIntervals.length; i++) {
            System.out.println(Arrays.toString(finalIntervals[i]));
        }
        System.out.println("<------------------------------------------------------>");
    }
}
