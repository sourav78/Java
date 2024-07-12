package Multithreading.Synchronization;

public class Stack {
    private int[] array;
    private int stackTop;
    private Object lock;

    public Stack(int capacity){
        array = new int[capacity];
        stackTop = -1;
        lock = new Object();
    }

    public synchronized boolean push(int element){
        if(isFull()) return false;

        ++stackTop;
        try {
            Thread.sleep(500);
        }catch (Exception e){}
        array[stackTop] = element;

        return true;
    }

    public synchronized int pop() {
        if(isEmpty()) return Integer.MIN_VALUE;
        int element = array[stackTop];
        array[stackTop] = Integer.MIN_VALUE;
        try {
            Thread.sleep(500);
        }catch (Exception e){}
        stackTop --;
        return element;
    }

    public boolean isEmpty(){
        return stackTop < 0;
    }

    public boolean isFull(){
        return stackTop == array.length-1;
    }
}
