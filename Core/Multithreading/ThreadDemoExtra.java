package Multithreading;

class ChildThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread());
        }
    }
}

public class ThreadDemoExtra {
    public static void main(String[] args) {

        Thread thread = new Thread(new ChildThread());
        thread.setName("Child Thread"); //Set the thread name
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
        }

//        System.out.println(thread.getName());
        System.out.println(Thread.currentThread());
    }
}
