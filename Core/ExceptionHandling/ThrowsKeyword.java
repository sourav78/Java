package ExceptionHandling;

public class ThrowsKeyword {
    public static void main(String[] args) {

        int arr[] = new int[5];

        try{
            int result = doCalculation(arr);
            System.out.println(result);
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("After execution");
    }

    public static int doCalculation(int[] arr) throws ArrayIndexOutOfBoundsException, ArithmeticException{
        int divisor = arr[8];
        return 5/divisor;
    }
}
