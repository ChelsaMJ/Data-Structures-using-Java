package hashtables.problems;

import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {

        // Check if the lengths of both strings are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create a hash map to store character frequencies
        Map<Character, Integer> charFrequency = new HashMap<>();

        // Count character frequencies in the first string
        for (char c : str1.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        // Iterate through the second string and check character frequencies
        for (char c : str2.toCharArray()) {
            if (!charFrequency.containsKey(c) || charFrequency.get(c) <= 0) {
                return false; // Not an anagram
            }
            charFrequency.put(c, charFrequency.get(c) - 1);
        }

        // Check if all character frequencies are zero
        for (int count : charFrequency.values()) {
            if (count != 0) {
                return false; // Not an anagram
            }
        }

        return true; // Strings are anagrams
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
