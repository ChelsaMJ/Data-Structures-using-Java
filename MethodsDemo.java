public class MethodsDemo {
    public static void main(String[] args) {
        Overloaded o1 = new Overloaded();
        o1.greet();
        o1.greet("Benjamin");
    }
}

class Overloaded{
    public void greet(){
        System.out.println("Hello Ji! Welcome to Java!");
    }
    public void greet(String name){
        System.out.println("Hello "+name+" Welcome to Java!");
    }
}