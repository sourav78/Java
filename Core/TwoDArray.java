/**
 * TwoDArray
 */

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //2D Array 

        int[][] tArr = {{1, 2, 3}, {4, 5, 6}};

        System.out.println(tArr[0]);
        System.out.println(tArr[0][0]);

        //Traversing an array
        for (int i = 0; i < tArr.length; i++) {
            for (int j = 0; j < tArr[i].length; j++) {
                System.out.print(tArr[i][j]);
            }
            System.out.println();
        }

        for (int[] child : tArr) {
            for (int ele : child) {
                System.out.print(ele);
            }
            System.out.println();
        }

        //Using method to print 2D array

        System.out.println( Arrays.deepToString(tArr));
        System.out.println( Arrays.deepToString(tArr).getClass()); //class java.lang.String
        System.out.println( Arrays.deepToString(tArr).getClass().getSimpleName()); //String


        System.out.println("------Input------");

        int[][] inputArt = new int[3][3];

        for (int i = 0; i < inputArt.length; i++) {
            for (int j = 0; j < inputArt[i].length; j++) {
                inputArt[i][j] = sc.nextInt();
            }
        }

        for (int[] child : inputArt) {
            for (int ele : child) {
                System.out.print(ele);

            }
            System.out.println();
        }
    }
}