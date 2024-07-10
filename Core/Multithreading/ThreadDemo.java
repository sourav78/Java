package Multithreading;

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println("Main start");

        Thread thread1 = new Thread1("CountingThread");
        thread1.start();

        //Implementing thread Using Runnable interface
        Thread thread2 = new Thread(new ThreadRunnable());
        thread2.start();

        System.out.println("Main end");
    }
}
