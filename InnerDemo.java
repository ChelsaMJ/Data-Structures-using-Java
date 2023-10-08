public class InnerDemo {
    public static void main(String[] args) {
        int val = 9;
        OuterClass Oc1 = new OuterClass();
        Oc1.display();
        Oc1.test();

    }
}
class OuterClass{
    int a = 6;
    int b = 7;
    void display(){
        System.out.println("Var a = "+a+" Var b = "+b);
    }

    void test(){
        InnerClass Ic1 = new InnerClass();
        Ic1.sum();
    }

    class InnerClass{
        int c = 9;
        void sum(){
            System.out.println("The sum is: "+a+b+c);
        }
    }
}
