import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr, int low, int high){
        if(low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while (left <= mid && right <= high) {
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for(int i = low; i <= high; i++){
            arr[i] = temp.get(i - low);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };

        mergeSort(arr, 0, 6);

        System.out.println(Arrays.toString(arr));
    }
}
