public class Constructors {
    public static void main(String[] args) {
        ConstructorDemo Cd1 = new ConstructorDemo("Benjamin","LPU");
        Cd1.display();
    }
}

class ConstructorDemo{
    String name;
    String address;
    ConstructorDemo(String n, String a){
        name = n;
        address = a;
    }
    public void display(){
        System.out.println("Name = "+name+"\nAddress = "+address);
    }
}
