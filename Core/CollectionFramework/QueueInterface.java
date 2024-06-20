package CollectionFramework;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {
        Queue<Integer> que = new ArrayDeque<>();

        //offer()
        que.offer(15);
        que.offer(20);
        que.offer(25);
        que.offer(30);
        System.out.println(que);

        //poll()
        System.out.println(que.poll());
        System.out.println(que);

        //peek()
        Integer next = que.peek();
        System.out.println(next);
        System.out.println(que);
    }
}
