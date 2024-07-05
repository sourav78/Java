import java.util.Arrays;

public class SelectionSort {

    //All case TC => O(n^2) 
    public static void selectionSort(int[] arr){
        for (int i = 0; i <= arr.length-2; i++) {
            int min = i;
            for (int j = i; j <= arr.length-1; j++) {
                if(arr[j] < arr[min]) min = j;
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 78, 45, 34, 87, 56};

        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
