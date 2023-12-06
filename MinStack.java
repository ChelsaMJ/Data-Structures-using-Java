import java.util.Stack;

class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            int poppedValue = stack.pop();
            if (poppedValue == minStack.peek()) {
                minStack.pop();
            }
        }
    }

    public int top() {
        if (!stack.isEmpty()) {
            return stack.peek();
        }
        throw new IllegalStateException("Stack is empty.");
    }

    public int getMin() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        }
        throw new IllegalStateException("Stack is empty.");
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(3);
        minStack.push(5);
        System.out.println("Current Min: " + minStack.getMin()); // Output: 3

        minStack.push(2);
        System.out.println("Current Min: " + minStack.getMin()); // Output: 2

        minStack.pop();
        System.out.println("Current Min: " + minStack.getMin()); // Output: 3
    }
}

// Now try implementing MaxStack