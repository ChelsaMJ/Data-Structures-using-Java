import java.util.Scanner;
import java.util.Stack;

public class RemoveMid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        for (int i=0;i<n;i++) {
            System.out.print("Enter element " + i + 1);
            st.push(sc.nextInt());
        }
        System.out.println("The ");
    }
    public void removeMid(Stack<Integer> stack, int n){
        Stack<Integer> st1 = new Stack<>();
        int mid = (n%2==0)?n/2:n/2+1;
        for(int j=0;j<mid-1;j++){
            int poppedEle = stack.pop();
            st1.push(poppedEle);
        }
        stack.pop();
        for(int j=0;j<mid-1;j++){
            stack.push(st1.pop());
        }

    }
}
