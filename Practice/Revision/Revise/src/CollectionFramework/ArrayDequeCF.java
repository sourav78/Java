package CollectionFramework;

import java.util.ArrayDeque;

public class ArrayDequeCF {
    public static void main(String[] args) {

        // Create a array deque
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Add element to the queue
        deque.offer(11);
        deque.offer(22);
        deque.offer(33);

        System.out.println("queue: "+deque);

        // Add Element in front or first position
        deque.offerFirst(100);
        deque.offerFirst(200);

        System.out.println("First insert: "+deque);

        // Add Element in rear or last position
        deque.offerLast(888);
        deque.offerLast(777);

        System.out.println("Rear insert: "+deque);

        // Peek element from the queue
        System.out.println("Default Peek: "+deque.peek());
        // Peek first element from the queue
        System.out.println("First Peek: "+deque.peekFirst());
        // Peek last element from the queue
        System.out.println("Last Peek: "+deque.peekLast());

        // Remove Element
        deque.poll();
        System.out.println("Default: "+deque);
        deque.pollFirst();
        System.out.println("poll first: "+deque);
        deque.pollLast();
        System.out.println("poll last: "+deque);
    }
}
