package ExceptionHandling;

public class FinallyBlock {
    public static void main(String[] args) {
        int[] arr = new int[5];

        try {
            System.out.println(arr[8]); //This line give me error so i wrapped up in try catch block
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Finally block is always run ");
        }

        //Unhandled exception
        try {
            System.out.println(arr[8]); //This line give me error so i wrapped up in try catch block
        }finally {
            System.out.println("Finally block is always run ");
        }

        System.out.println("After exception");
    }
}
