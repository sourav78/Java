package CollectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueCF {
    public static void main(String[] args) {

        // Creation of priority queue
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // Add elements
        queue.offer(23);
        queue.offer(12);
        queue.offer(4);
        queue.offer(29);
        queue.offer(22);

        System.out.println("Queue: "+queue);

        //Peek item from the queue
        System.out.println("RTO: "+queue.peek());

        // Remove item from the queue
        System.out.println("removing: "+queue.poll());
        System.out.println("removed stack: "+queue);
        System.out.println("Outer most: "+queue.peek());
    }
}
