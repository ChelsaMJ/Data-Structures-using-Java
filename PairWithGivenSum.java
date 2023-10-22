package hashsets;

import java.util.Arrays;
import java.util.HashSet;


// APPROACH :: 1 (Brute Force)
/*public class PairWithGivenSum {
    public static boolean hasPairWithSum(int[] arr, int targetSum) {
        Arrays.sort(arr); // Sort the array in ascending order
        int first = 0; // Pointer to the first element
        int last = arr.length - 1; // Pointer to the last element

        while (first < last) {
            int sum = arr[first] + arr[last];

            if (sum == targetSum) {
                return true; // Pair with the target sum found
            } else if (sum < targetSum) {
                first++; // Increment the first pointer
            } else {
                last--; // Decrement the last pointer
            }
        }

        return false; // Pair with the target sum not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 7, 9, 3};
        int targetSum = 11;

        boolean hasPair = hasPairWithSum(arr, targetSum);
        System.out.println("Does the array have a pair with the target sum? " + hasPair);
    }
}*/
// APPROACH :: 2 (Optimized )
public class PairWithGivenSum {
    public static boolean hasPairWithSum(int[] arr, int targetSum) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            int difference = targetSum - num;

            if (set.contains(difference)) {
                return true; // Pair with the target sum found
            }

            set.add(num);
        }

        return false; // Pair with the target sum not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 7, 9, 3};
        int targetSum = 11;

        boolean hasPair = hasPairWithSum(arr, targetSum);
        System.out.println("Does the array have a pair with the target sum? " + hasPair);
    }
}