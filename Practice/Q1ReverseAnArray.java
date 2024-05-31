import java.util.Arrays;

public class Q1ReverseAnArray {
    public static void main(String[] args) {
        
        int[] arr = {20, 30, 80, 10, 50};

        int first = 0;
        int last = arr.length-1;

        while (last > first) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;

        }

        System.out.println(Arrays.toString(arr));

    }
}
