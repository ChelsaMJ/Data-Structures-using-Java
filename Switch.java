import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
      // ASCII
        // numeric types - int, short, byte, char
        switch (num){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7,8,9,10:
                System.out.println("Days 7, 8,9, 10 not valid");
                break;
            default:
                System.out.println("Not a valid number");
        }

        switch (num){

        }
    }
}
