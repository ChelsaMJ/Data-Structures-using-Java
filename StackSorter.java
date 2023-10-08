package practicals;
import java.util.Stack;

public class StackSorter {

    // Function to sort a stack in ascending order
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            // Pop the top element
            int temp = stack.pop();

            // Recursively sort the remaining stack
            sortStack(stack);

            // Insert the popped element in the sorted stack
            insertSorted(stack, temp);
        }
    }

    // Function to insert an element into a sorted stack
    public static void insertSorted(Stack<Integer> stack, int element) {
        // Base case: If the stack is empty or the top element is smaller, push the element
        if (stack.isEmpty() || element > stack.peek()) {
            stack.push(element);
            return;
        }

        // If the element is smaller than the top element, pop the top element and
        // recursively insert the element
        int temp = stack.pop();
        insertSorted(stack, element);

        // Push back the top element
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

        // Sort the stack
        sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}
