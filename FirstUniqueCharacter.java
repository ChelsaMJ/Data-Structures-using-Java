package practicals;
import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {

    // Function to find the first unique character in a string
    public static char findFirstUnique(String s) {
        // Create a hash map to store character frequencies
        Map<Character, Integer> charCount = new HashMap<>();

        // Count the frequency of each character in the string
        for (char c : s.toCharArray()) {
//            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            if (charCount.containsKey(c)){
                charCount.put(c,charCount.get(c)+1);
            }
            else{
                charCount.put(c,1);
            }

        }

        // Find the first unique character
        for (char c : s.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }

        // If no unique character is found, return a default value (e.g., '#')
        return '#';
    }

    public static void main(String[] args) {
        String input1 = "leetcode";
        String input2 = "loveleetcode";

        System.out.println("First unique character in '" + input1 + "': " + findFirstUnique(input1));
        System.out.println("First unique character in '" + input2 + "': " + findFirstUnique(input2));
    }
}
