
//Find a pair with the given sum in an array
//Input: nums = [8, 7, 2, 5, 3, 1]
//target = 10
//Output: Pair found (8, 2)
//or
//Pair found (7, 3)
//
//Input: nums = [5, 2, 6, 8, 1, 9]
//target = 12
//Output: Pair not found

import java.util.HashMap;

public class Q14FindPairHash {

    public static void FindPair(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++){
            if(map.containsKey(target - arr[i])){
                System.out.println(arr[map.get(target - arr[i])]+" "+arr[i]);
                return;
            }
            map.put(arr[i], i);
        }
        System.out.println("Pair nor found.");
    }

    public static void main(String[] args) {
//        int[] nums = {8, 7, 2, 5, 3, 1};
//        int target = 10;
//
//        FindPair(nums, target);

        int[] nums = {5, 2, 6, 8, 1, 9};
        int target = 12;

        FindPair(nums, target);
    }
}
