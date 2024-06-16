package ExceptionHandling;

public class TryCatch {
    public static void main(String[] args) {
        int[] arr = new int[5];

        try {
            arr[7] = 78; //This line give me error so i wrapped up in try catch block
        }catch (Exception e){
            System.out.println("All type of exception handled.");
            System.out.println(e);
            System.out.println(e.getStackTrace()[0]);
            System.out.println(e.getMessage());
        }

        try{
            int result = 5/0;
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Handing the error.");
        }catch(NullPointerException n){
            System.out.println("Handling the error in other method.");
        }

        System.out.println("After exception");
    }
}
