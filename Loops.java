import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // usage of loops
        /*while (expressiom evaluates to true){
            body goes here
            loop control variable
        }
    }*/

        // example of while loop
        /*int num = sc.nextInt();
        while (num > 0) {
            System.out.print(num+" ");
            num--;
        }*/

        // do while loop
        /*do{
            block of code
        } while(expression is true);*/
        int num = -1;
        do{
            System.out.println(num);
        } while (num > 1);

    }
}
