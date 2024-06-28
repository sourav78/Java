import java.util.HashSet;

public class Q15Subarray0Sum {

    //Hashing ->  -> TC = O(n)
    public static boolean find0SumHashing(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        int sum = 0;
        for (int num: arr){
            sum += num;

            if(set.contains(sum))
                return true;
            set.add(sum);
        }
        return false;
    }

    //Brute force approach -> TC = O(n*n)
    public static boolean find0Sum(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                sum += arr[j];

                if(sum == 0)
                    return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(find0Sum(new int[]{3, 4, -7, 3, 1, 3, 1, -4, -2, -2}));
        System.out.println(find0Sum(new int[]{3, 2, -4, 6}));
        System.out.println(find0Sum(new int[]{1, 2, -4, 2}));


        System.out.println(find0SumHashing(new int[]{1, 2, -4, 2}));
        System.out.println(find0SumHashing(new int[]{3, 4, -7, 3, 1, 3, 1, -4, -2, -2}));


    }
}
