public class FindMinElement {

    // Recursive function to find the minimum element
    public static int findMin(int[] arr, int n) {
        // Base case: if there is only one element left
        if (n == 1) {
            return arr[0];
        }

        // Recursively get the minimum of the remaining array
        return Math.min(arr[n-1], findMin(arr, n-1));
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 2, 8};

        // Find the minimum element using recursion
        int min = findMin(arr, arr.length);

        // Print the minimum element
        System.out.println("Minimum element is: " + min);
    }
}
