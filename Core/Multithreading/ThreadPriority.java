package Multithreading;

class Priority implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread());
        }
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Priority(), "Priority-1");
        Thread t2 = new Thread(new Priority(), "Priority-2");
        t1.setPriority(2);
        t2.setPriority(Thread.MAX_PRIORITY); // Here max priority means 10
        t1.start();
        t2.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
        }
    }
}
