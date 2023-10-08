import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Box b1 = new Box();
        Box b2 = new Box();

        System.out.println("Enter the height for Box b1: ");
        b1.setHeight(sc.nextDouble());
        System.out.println("Enter the length for Box b1: ");
        b1.setLength(sc.nextDouble());
        System.out.println("Enter the width for Box b1: ");
        b1.setWidth(sc.nextDouble());

        System.out.println("Enter the height for Box b2: ");
        b2.setHeight(sc.nextDouble());
        System.out.println("Enter the height for Box b2: ");
        b2.setLength(sc.nextDouble());
        System.out.println("Enter the height for Box b2: ");
        b2.setWidth(sc.nextDouble());

        System.out.println("Length of Bo b1 = "+b1.getLength());
        System.out.println("Length of Bo b1 = "+b1.getWidth());
        System.out.println("Length of Bo b1 = "+b1.getHeight());

        System.out.println("Length of Bo b2 = "+b2.getLength());
        System.out.println("Length of Bo b2 = "+b2.getWidth());
        System.out.println("Length of Bo b2 = "+b2.getHeight());

        System.out.println("Surface arae of box b1 = "+ b1.surfaceArea());
        System.out.println("Volume of Box b1 = "+ b1.volume());

    }
}

class Box{
    private double length;
    private double width;
    private double height;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume(){
        return width*height*length;
    }
    public double surfaceArea(){
        return 2 * (length*height + height*width + width*length);
    }
}