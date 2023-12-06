package practicals;

import java.util.Scanner;

public class StatsProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array of numbers = ");
        int size = sc.nextInt();
        int sum = 0;
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter any integer: ");
            numbers[i]  = sc.nextInt();
            sum += numbers[i];
        }
        double mean = (double) sum / size;
        double diffSquareSum = 0.0;
        for (int i = 0; i < size; i++) {
            diffSquareSum += Math.pow((numbers[i] - mean), 2);
        }
        double variance = diffSquareSum / (size-1);
        System.out.printf("Variance of given numbers = %.2f", variance);
    }


}
