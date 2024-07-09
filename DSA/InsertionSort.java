import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    public static void recursiveInsertionSort(int[] arr, int i, int n) {
        if (i == n) return;
        int j = i;

        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j];
            arr[j] = arr[j - 1];
            arr[j - 1] = temp;
        }

        recursiveInsertionSort(arr, i+1, n);
    }

    public static void main(String[] args) {
        int[] arr = { 35, 76, 13, 26, 37, 90, 65 };

        // insertionSort(arr);
        recursiveInsertionSort(arr, 0, 7);

        System.out.println(Arrays.toString(arr));
    }
}
