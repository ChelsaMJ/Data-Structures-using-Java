public class LastNonZeroDigit {

    public static int lastNonZeroDigit(int n) {
        int res = 1;

        // Iterate through all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            int num = i;

            // Remove all factors of 2 and 5 from the number
            while (num % 5 == 0) {
                num /= 5;
            }
            while (num % 2 == 0) {
                num /= 2;
            }

            // Multiply remaining part of num modulo 10
            res = (res * num) % 10;
        }

        return res;
    }

    public static void main(String[] args) {
        int n = 25;

        // Find the last non-zero digit of n!
        int result = lastNonZeroDigit(n);
        System.out.println("The last non-zero digit of " + n + "! is: " + result);
    }
}
