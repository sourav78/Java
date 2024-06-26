import java.util.Arrays;
import java.util.HashMap;

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

    //Hashing using HashMap

    public static HashMap<Integer, Integer> hashingUsingHashMap(int[] arr){
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(hashMap.get(arr[i]) == null){
                hashMap.put(arr[i], 1);
            }else{
                hashMap.replace(arr[i], hashMap.get(arr[i])+1);
            }
        }

        return hashMap;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 2, 3, 6, 7, 4, 3, 2, 6};

        frequencyCount(arr, arr.length, 7);

        HashMap<Integer, Integer> hashedMap = hashingUsingHashMap(arr);

        System.out.println(hashedMap.getOrDefault(3, 0));
        System.out.println(hashedMap.getOrDefault(1, 0));
        System.out.println(hashedMap.getOrDefault(9, 0));
    }
}
