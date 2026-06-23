package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCF {
    public static void main(String[] args) {

        // Create New queue
        Queue<Integer> queue = new LinkedList<>();

        // Add elements to the queue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        System.out.println("queue: "+queue);

        //Peek item from the queue
        System.out.println("RTO: "+queue.peek());

        // Remove item from the queue
        System.out.println("removing: "+queue.poll());
        System.out.println("removed stack: "+queue);
        System.out.println("Outer most: "+queue.peek());
    }
}
