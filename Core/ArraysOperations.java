import java.util.Scanner;
import java.util.Arrays;

public class ArraysOperations {
    public static void main(String[] args) {
        
        //Method - 1
        int[] arr1 = {12, 27, 14, 15};

        //method-2
        int arr2[];

        //Method - 3 -> with size
        int[] arr3 = new int[3];

        // System.out.println(arr1);  //This print address of the array -> [I@2f92e0f4

        // System.out.println(arr1[0]);
        // System.out.println(arr1[1]);


        //Reverse an array
        // for (int i = arr1.length-1; i >= 0; i--) {
        //     System.out.print(arr1[i] + " ");
        // }


        System.out.println();
        //Swap first and last element of an array

        // int[] mainArray = {2, 12, 27, 14, 15, 72, 53};

        // int firstEle = mainArray[0];

        // mainArray[0] = mainArray[mainArray.length-1];
        // mainArray[mainArray.length-1] = firstEle;

        // for (int i : mainArray) {
        //     System.out.print(i + " ");
        // }


        //Taking user input in array

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter number of subject: ");
        // int numberOfSubject = sc.nextInt();
        
        // int[] marks = new int[numberOfSubject];

        // System.out.println("Enter subvject Matks");

        // for (int i = 0; i < marks.length; i++) {
        //     marks[i] = sc.nextInt();
        // }

        // for (int i : marks) {
        //     System.out.print(i + " ");
        // }

        // sc.close();

        //To tke character input in array need to use charAt function
        //sc.next().chartAt(0)


        // int[] OFB = {2, 12, 27, 14, 15, 72, 53};

        // try {
        //     System.out.println(OFB[-20]);
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }



        //Printing array using methods

        //toString

        int[] arr = {2, 12, 27, 14, 15, 72, 53};
        System.out.println(Arrays.toString(arr));
    }   
}
