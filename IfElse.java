import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
//        int age;
        Scanner sc = new Scanner(System.in);
//        age = sc.nextInt();
//        if (age >= 18) System.out.printf("Congrats! You can vote");
//        else System.out.printf("Sorry can't vote");
        System.out.print("enter integer: ");
        int n = sc.nextInt();
        if (n%15==0) System.out.println("FizzBuzz");
        else if (n%3==0) System.out.println("Fizz");
        else if (n%5==0) System.out.println("Buzz");
        else System.out.println(n);
    }
}
// multiple of 3 --> print Fizz
// multiple of 5 --> print Buzz
// multiple of 15 --> print FizzBuzz
// print number in otherwise
