package practicals;

import java.util.Scanner;

public class PrimeNumbers1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range / end: ");
        int[] primes = new int[1000000];
        int j = 0;
        int n = sc.nextInt();
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                primes[j] = i;
                j += 1;
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.print(primes[i] + " ");

        }
    }

    public static boolean isPrime(int num) {
        /*for (int i = 2; i < num; i++) {
            if(num%i==0)
                return false;
        }
        return true;*/

        /*for (int i = 2; i < num / 2 + 1; i++) {
            if (num % i == 0)
                return false;
        }
        return true;*/
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
