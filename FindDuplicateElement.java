package hashtables.problems;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateElement {
    public static int findDuplicate(int[] nums) {

        // Create a hash map to store elements and their counts
    /*
        // More rigid and hard-coded implementation, not recommended
        HashMap<Integer, Integer> elementCounts = new HashMap<>();
    */
        Map<Integer, Integer> hm = new HashMap<>();

        // Iterate through the array
        for (int num : nums) {      //below
            // If the element is already in the map, it's a duplicate
            if (hm.containsKey(num)) {
                return num;
            }
            // Otherwise, add it to the map with a count of 1
            hm.put(num, 1);
        }

        // If no duplicate is found, return -1 or any other suitable value
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2}; // Example array with a duplicate element
        int duplicate = findDuplicate(arr);

        if (duplicate != -1) {
            System.out.println("Duplicate element is: " + duplicate);
        } else {
            System.out.println("No duplicate element found.");
        }
    }
}




/*
public class FindDuplicateElementUsingArray {
    public static int findDuplicate(int[] nums) {
        int n = nums.length;

        // Create an array to mark visited elements
        boolean[] visited = new boolean[n];

        for (int num : nums) {
            // If the element is already visited, it's a duplicate
            if (visited[num]) {
                return num;
            }

            // Mark the element as visited
            visited[num] = true;
        }

        // If no duplicate is found, return -1 or any other suitable value
        return -1;
    }
*/

