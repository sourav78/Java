package Multithreading.Synchronization;

public class StackOperation {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        new Thread(() -> {
           int count = 0;
           while(count <= 5){
               System.out.println("Push: "+stack.push(10));
               count++;
           }
        }, "PushStack").start();

        new Thread(() -> {
           int count = 0;
           while(count <= 5){
               System.out.println("Pop: "+stack.pop());
               count++;
           }
        }, "PopStack").start();
    }
}
