package TwoDimensionalArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<int[]> interval = new ArrayList<>();
        List<int[]> mergedIntervals = new ArrayList<>();

        interval.add(new int[] {1,3});
        interval.add(new int[] {2,6});
        interval.add(new int[] {8,10});
        interval.add(new int[] {15,16});
        interval.add(new int[] {17, 31});
        interval.add(new int[] {25, 37});

        int nextinterval = 0;

        for (int i=0;i<interval.size();i++){
            int[] leftArray = interval.get(i);
            int[] rightArray ;

                try{
                    nextinterval=i+1;
                    rightArray = interval.get(nextinterval);
                }catch (Exception e){
                    mergedIntervals.add(leftArray);
                    break;

                }

                if(leftArray[1]>=rightArray[0]){
                    mergedIntervals.add(merge(leftArray,rightArray));

                    //we have merge two interval so skip one interval
                    i++;
                }else {
                    mergedIntervals.add(leftArray);
                }


        }

       for(int[] intArr : mergedIntervals){
           System.out.println(Arrays.toString(intArr));
       }
    }

    //this is the method to add he interval in mergeList
    public static int[] merge(int[] left, int[] right) {
        return new int[] {left[0], right[1]};
    }
}
