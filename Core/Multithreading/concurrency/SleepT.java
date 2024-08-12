package Multithreading.concurrency;

class SleepDemo implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" - "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class SleepDemo2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" - "+i);
        }
    }
}

public class SleepT {
    public static void main(String[] args) {
        Thread t1 = new Thread(new SleepDemo());
        Thread t2 = new Thread(new SleepDemo2());
        t1.start();
        t2.start();
    }
}
