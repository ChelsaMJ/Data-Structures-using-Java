class Student {
    public String name;
    private int age;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
public class Demo1{
    public static void main(String[] args) {
//        Student s1;
//        s1 = new Student();
        Student s1 = new Student();     // creating student object
        s1.name = "Amandeep";
        System.out.println(s1.name);

        //can't access private member using dot operator
//        s1.age = 50;
//        System.out.println(s1.age);
        s1.setAge(20);
        System.out.println(s1.getAge());
    }
}
