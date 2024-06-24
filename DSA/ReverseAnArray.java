import java.util.Arrays;

public class ReverseAnArray {


    static int[] reservseArray(int[] arr){

        int f = 0;
        int l = arr.length-1;

        for (int i = 0; i < arr.length/2; i++) {
            if(f >= l){
                break;
            }else{
                int temp = arr[f];
                arr[f] = arr[l];
                arr[l] = temp;
            }

            f++;
            l--;
        }

        return arr;
    }

    //Using 1 pointer

    static void ReverseAnArrayUsingRecursion(int i, int arr[], int n){
        if(i >= n/2) return;

        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;

        ReverseAnArrayUsingRecursion(i+1, arr, n);
    }

    static void ReverseAnArrayUsingRecursion2Pointer(int l, int r, int arr[]){
        if(l >= r) return;

        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        ReverseAnArrayUsingRecursion2Pointer(l+1, r-1, arr);
    }

    public static void main(String[] args) {
        int[] newarr = {1, 2, 3, 4, 5, 6};

        ReverseAnArrayUsingRecursion(0, newarr, newarr.length);
        System.out.println(Arrays.toString(newarr));

        ReverseAnArrayUsingRecursion2Pointer(0, newarr.length-1, newarr);
        System.out.println(Arrays.toString(newarr));

        // System.out.println(Arrays.toString(reservseArray(newarr)));
    }
}
