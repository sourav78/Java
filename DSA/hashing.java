import java.util.Arrays;

public class hashing {

    public static void frequencyCount(int arr[], int N, int P){
        int[] hashArr = new int[N+1];

        for(int i = 0; i < N; i++){
            
            if(arr[i] <= N)
                hashArr[arr[i]] += 1;
        }

        for (int i = 0; i < N; i++) {
            arr[i] = hashArr[i+1];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 2, 3, 6, 7, 4, 3, 2, 6};

        frequencyCount(arr, arr.length, 7);
    }
}
