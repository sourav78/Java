package Multithreading.concurrency;

class JoinDemo implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" - "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class JoinT {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new JoinDemo(), "joinThread");
        t1.start();
        t1.join();
//        t1.join(1000);

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" - "+i);
        }
    }
}
