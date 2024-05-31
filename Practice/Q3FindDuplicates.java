public class Q3FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {20, 30, 80, 30, 10, 50, 70, 67, 70, 20};

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
