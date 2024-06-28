import java.util.HashMap;
import java.util.Map;

public class Q16FindDuplicatedInRange {

    public static boolean FindDuplicates(int[] arr, int k){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                if(i - map.get(arr[i]) <= k){
                    return true;
                }
            }

            map.put(arr[i], i);
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println(FindDuplicates(new int[]{ 5, 6, 8, 2, 4, 6, 9 }, 4));
        System.out.println(FindDuplicates(new int[]{ 5, 6, 8, 2, 4, 6, 5 }, 2));
        System.out.println(FindDuplicates(new int[]{ 1, 2, 3, 2, 1 }, 2));

    }

}
