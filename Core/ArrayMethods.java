import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        
        int arr[] = {3, 8, 6, 16, 81, 2, 43, 22, 1};

        //toString -> Converts the array to a string representation.

        System.out.println(Arrays.toString(arr));
        
        //sort(array)-> Sorts the array in ascending order.
        
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));
    }
}
