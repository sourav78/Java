import java.util.HashSet;
import java.util.Set;

public class Q17CountDistinctValue {
    public static int countDistinctValue(int[] arr){
        Set<Integer> set = new HashSet<>();

        for (int num: arr){
            set.add(Math.abs(num));
        }

        return set.size();
    }

    public static void main(String[] args) {

        System.out.println(countDistinctValue(new int[]{-1, -1, 0, 1, 1, 1}));
        System.out.println(countDistinctValue(new int[]{ -1, -1, -1, -1 }));
        System.out.println(countDistinctValue(new int[]{ -2, -1, 0, 1, 2, 3 }));
    }
}
