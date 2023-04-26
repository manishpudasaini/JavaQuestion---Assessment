package TwoDimensionalArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int[][] twoDimensional = {{1,5},{3,7},{8,9}};
        for(int i =0;i<twoDimensional.length;i++){
            System.out.println(Arrays.toString(twoDimensional[i]));
        }
        List<int[]> twodimensionalArrayList = new ArrayList<>();
        System.out.println(twodimensionalArrayList.size());


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("size of row");
//        int row = scanner.nextInt();
//        System.out.println("size of column");
//        int col = scanner.nextInt();
//
//        int[][] number = new int[row][col];
//
//        System.out.println("enter element in array");
//        for(int i=0;i<row;i++){
//            for (int j =0 ; j<col;j++){
//
//                number[i][j] = scanner.nextInt();
//                System.out.println();
//            }
//        }
//        for(int i=0;i<row;i++){
//            for (int j =0 ; j<col;j++){
//                System.out.print(number[i][j] + " ");
//            }
//            System.out.println();
//        }
//
       }
}
