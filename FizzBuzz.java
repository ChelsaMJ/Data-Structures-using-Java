import java.util.Scanner;


public class FizzBuzz{
public static void main(Strings[] args){

System.out.print("Enter a integer: ")
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
//
//if(n%15==0) System.out.print("FizzBuzz");
//else if(n%3==0) System.out.print("Fizz");
//else if(n%5==0) System.out.print("Buzz");
//else System.out.print(n);

for(int n=0; n<=100; n++){
if(n%15==0) System.out.print("FizzBuzz");
else if(n%3==0) System.out.print("Fizz");
else if(n%5==0) System.out.print("Buzz");
else System.out.print(n);

}


}
}

