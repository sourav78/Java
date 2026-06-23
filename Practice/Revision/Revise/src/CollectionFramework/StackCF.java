package CollectionFramework;

import java.util.Stack;

public class StackCF {
    public static void main(String[] args) {
        // Create a new stack using stack class
        Stack<Integer> stack = new Stack<>();

        // Add element in the stack -> push
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Stack: "+stack);

        // Peek item from the stack
        System.out.println("Outer most: "+stack.peek());
        System.out.println("Outer most: "+stack.peek());

        // Remove elements from the stack -> pop()
        System.out.println("removing: "+stack.pop());
        System.out.println("removed stack: "+stack);
        System.out.println("Outer most: "+stack.peek());

        // Get first and last element of the stack
        System.out.println("First"+stack.getFirst());
        System.out.println("Last"+stack.getLast());

        // Check if stack is empty
        System.out.println("Empty? "+stack.empty());
        Stack<Integer> st = new Stack<>();
        System.out.println("Empty? "+st.empty());
    }
}
