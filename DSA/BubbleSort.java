import java.util.Arrays;

public class BubbleSort {

    //Wrost and Avarage case TC => O(n^2) 
    //Best case TC => O(n) 

    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i >= 1; i--) {
            int didSwap = 0;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap == 0) break;
        }
    }

    public static void recursiveBubbleSort(int[] arr, int n){
        if(n == 1) return;
        for(int i = 0; i <= n-2; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        recursiveBubbleSort(arr, n-1);
    }

    public static void main(String[] args) {
        int[] arr = {876, 456, 675, 234, 9875, 564, 65};
        // int[] arr = {235, 463, 562, 745, 897};

        // bubbleSort(arr);
        recursiveBubbleSort(arr, 7);

        System.out.println(Arrays.toString(arr));
    }
}
