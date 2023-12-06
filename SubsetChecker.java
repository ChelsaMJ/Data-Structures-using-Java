package hashtables.problems;

import java.util.HashMap;
import java.util.Map;

public class SubsetChecker {
    public static boolean isSubset(int[] arr1, int[] arr2) {

        // Create a HashMap to store element frequencies from arr1
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count element frequencies in arr1
        for (int num : arr1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Check if arr2 is a subset of arr1
        for (int num : arr2) {
            if (!frequencyMap.containsKey(num) || frequencyMap.get(num) <= 0) {
                return false; // Element in arr2 not found or no more occurrences in arr1
            }
            frequencyMap.put(num, frequencyMap.get(num) - 1);
        }

        return true; // arr2 is a subset of arr1
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 1};

        if (isSubset(arr1, arr2)) {
            System.out.println("arr2 is a subset of arr1.");
        } else {
            System.out.println("arr2 is not a subset of arr1.");
        }
    }
}
