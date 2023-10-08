package practicals;
import java.util.Stack;

public class DeleteMiddleElement {

    // Function to delete the middle element from a stack
    public static void deleteMiddle(Stack<Integer> stack) {
        int size = stack.size();
        int middle = size / 2;

        // Helper function to delete the middle element recursively
        deleteMiddleRecursive(stack, middle);
    }

    // Helper function to delete the middle element recursively
    private static void deleteMiddleRecursive(Stack<Integer> stack, int middle) {
        // Base case: If middle elements have been removed, return
        if (middle == 0) {
            stack.pop();
            return;
        }

        // Pop the top element
        int temp = stack.pop();

        // Recursively delete the middle element
        deleteMiddleRecursive(stack, middle - 1);

        // Push the popped element back if it's not the middle
        stack.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(2);
        stack.push(9);
        stack.push(1);
        stack.push(6);

        System.out.println("Original Stack: " + stack);

        // Delete the middle element
        deleteMiddle(stack);

        System.out.println("Stack after deleting middle element: " + stack);
    }
}
