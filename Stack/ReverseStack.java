package Stack;

import java.util.Stack;

public class ReverseStack {

    // Method to insert an element at the bottom of a stack
    public static void insertAtBottom(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
            return;
        }
        
        // Hold all items in function call stack until we reach end of the stack
        int top = stack.pop();
        insertAtBottom(stack, item);
        
        // Push the held items back
        stack.push(top);
    }
    
    // Method to reverse the given stack using recursion
    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        
        // Hold all items in function call stack until we reach end of the stack
        int top = stack.pop();
        reverseStack(stack);
        
        // Insert all the items held in function call stack at the bottom
        insertAtBottom(stack, top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        System.out.println("Original Stack (Top to Bottom): " + stack);
        
        reverseStack(stack);
        
        System.out.println("Reversed Stack (Top to Bottom): " + stack);
    }
}
