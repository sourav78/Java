package ExceptionHandling;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age: ");
        try{
            int age = sc.nextInt();

            if (age > 100){
                throw new MyException("Age should not be grater than 100");
            }
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}

class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}
