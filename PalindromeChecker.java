import java.util.Stack;

public class PalindromeChecker {
    public static boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();

        // Push the first half of the characters onto the stack
        int length = input.length();
        int halfLength = length / 2;
        for (int i = 0; i < halfLength; i++) {
            stack.push(input.charAt(i));
        }

        // Compare the second half of the characters with the stack content
        int startIndex = (length % 2 == 0) ? halfLength : halfLength + 1;
        for (int i = startIndex; i < length; i++) {
            char c = input.charAt(i);
            if (stack.isEmpty() || c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String palindrome = "racecar";
        String notPalindrome = "hello";

        System.out.println(palindrome + " is a palindrome: " + isPalindrome(palindrome));
        System.out.println(notPalindrome + " is a palindrome: " + isPalindrome(notPalindrome));
    }
}
