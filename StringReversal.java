import java.util.Stack;

public class StringReversal {
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();

        // Push each character of the input string onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Pop characters from the stack to reverse the string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        String reversed = reverseString(input);

        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
}
