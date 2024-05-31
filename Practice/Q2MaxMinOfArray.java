public class Q2MaxMinOfArray {
    public static void main(String[] args) {
        int[] arr = {20, 30, 80, 10, 50};

        int max = arr[0];
        int min = arr[0];

        for (int i : arr) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }

        System.out.println(min);
        System.out.println(max);
    }
}
