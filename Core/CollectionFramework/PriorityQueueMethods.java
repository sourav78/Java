package CollectionFramework;

import java.util.PriorityQueue;

public class PriorityQueueMethods {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)->b-a);

        pq.offer(50);
        pq.offer(30);
        pq.offer(60);
        pq.offer(20);

        System.out.println(pq);
    }
}
