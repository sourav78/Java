package Multithreading.InterThreadComm;

class ChildWait extends Thread{

    int total = 0;
    @Override
    public void run() {
        synchronized (this){
            System.out.println("Child thread starts execution");
            for (int i = 0; i < 15; i++) {
                total = total + i;
            }
            System.out.println("After execution -> child thread giving notification");
            this.notify();
        }
    }
}

public class WaitDemo {
    public static void main(String[] args) throws InterruptedException {
        ChildWait t = new ChildWait();
        t.start();

        synchronized (t){
            System.out.println("Main thread is waiting for child");
            t.wait();
            System.out.println("Main thread got notification");
            System.out.println("Total is : "+t.total);
        }
    }
}
