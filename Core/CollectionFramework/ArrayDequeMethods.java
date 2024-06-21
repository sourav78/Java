package CollectionFramework;

import java.util.ArrayDeque;
import java.util.Arrays;

public class ArrayDequeMethods {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>(Arrays.asList(10, 20, 30, 40, 50));

        //offerFirst
        dq.offerFirst(100);
        System.out.println(dq);

        //offerLast
        dq.offerLast(200);
        System.out.println(dq);

        //pollFirst
        dq.pollFirst();
        System.out.println(dq);

        //pollLast
        dq.pollLast();
        System.out.println(dq);

        //peekFirst
        System.out.println(dq.peekFirst());

        //peekLast
        System.out.println(dq.peekLast());

        //Stack operation in ArrayDeque
        System.out.println("Stack");

        ArrayDeque<Integer> stack = new ArrayDeque<>(Arrays.asList(1, 2, 3, 4, 5));

        //push()
        stack.push(55);
        stack.push(56);
        System.out.println(stack);

        //pop()
        System.out.println(stack.pop());
        System.out.println(stack);

        //Queue operation in ArrayDeque
        System.out.println("Queue");

        ArrayDeque<Integer> queue = new ArrayDeque<>(Arrays.asList(1, 5, 10, 15, 20));

        //offer()
        queue.offer(100);
        System.out.println(queue);

        //poll()
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
