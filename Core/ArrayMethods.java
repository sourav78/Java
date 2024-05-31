import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayMethods {
    public static void main(String[] args) {
        
        int arr[] = {3, 8, 6, 16, 81, 2, 43, 22, 1};

        //toString -> Converts the array to a string representation.

        System.out.println(Arrays.toString(arr));
        
        //sort(array)-> Sorts the array in ascending order.
        
        // Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //binarySearch
        
        System.out.println("Index is: "+Arrays.binarySearch(arr, 16));

        //copyOfRange
        int[] copiedArr = Arrays.copyOfRange(arr, 1, 5);
        System.out.println(Arrays.toString(copiedArr));

        //equals()
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        System.out.println(Arrays.equals(arr1, arr2));

        //fill
        int[] filledArr = new int[5];
        Arrays.fill(filledArr, 1);
        System.out.println(Arrays.toString(filledArr));

        //deepToString

        int[][] deepArr = {{1, 2}, {3, 4}};
        System.out.println(Arrays.deepToString(deepArr));

        //hashCode
        
        System.out.println(Arrays.hashCode(arr));

        //

        IntStream stream = Arrays.stream(arr);
        System.out.println(stream);
    }
}
