package Multithreading.concurrency;

class YeildDemo implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" - "+i);
            Thread.yield();
        }
    }
}

class yieldDemo2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" - "+i);
        }
    }
}

public class YeildT {
    public static void main(String[] args) {

        Thread t1 = new Thread(new YeildDemo(), "YeildThread");
        Thread t2 = new Thread(new yieldDemo2(), "Yield-2");
        t1.start();
        t2.start();

//        for (int i = 0; i < 5; i++) {
//            System.out.println("Main Thread");
//        }
    }
}
