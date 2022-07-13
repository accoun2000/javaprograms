package interfaceDemo;
import java.util.Scanner;
public interface Shape
{
double CalculateArea();

default void display() {
    System.out.println("Calculating Area of different shapes:");
}
}
class rectangle implements Shape {
    int breadth;
    int height;

    public rectangle(int breadth, int height) {
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    public double CalculateArea() {
        return breadth*height;
    }

    @Override
    public void display() {
        Shape.super.display();
        System.out.println("Area of rectangle is : "+CalculateArea());
    }
}
class Shapeimpl{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do{
            System.out.println("1.Rectangle\n 2.Circle\n 3.Square\n 4.Triangle\n 5.Exit");
            System.out.println("Enter your choice:");
            ch = sc.nextInt();
            Shape shape;
            switch(ch){
                case 1:
                    System.out.println("Enter breadth and height:");
                    int breadth = sc.nextInt();
                    int height = sc.nextInt();
                    shape = new rectangle(breadth,height);
                    System.out.println("Area of rectangle:"+shape.CalculateArea());
                    break;
                case 2:
                    System.out.println("Enter radius:");
                    float radius = sc.nextInt();
                    shape = new Circle(radius);
                    System.out.println("Area of Circle is:"+shape.CalculateArea());
                    break;
                case 3:
                    System.out.println("Enter Side:");
                    float Side = sc.nextInt();
                    shape = new Square(Side);
                    System.out.println("Area of Square is:"+shape.CalculateArea());
                    break;
                case 4:
                    System.out.println("Enter breadth and height");
                    int h1 = sc.nextInt();
                    int b1 = sc.nextInt();
                    shape = new Triangle(b1,h1);
                    System.out.println("Area of Triangle is:"+shape.CalculateArea());
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println();
            }
        }
        while(ch <= 5 && ch > 0);
    }
}
class Circle implements Shape {
    float pi = 3.14F;
    float radius = 5.5F;
    public Circle(float radius){
        this.radius = radius;
    }

    @Override
    public double CalculateArea() {
        return pi*radius*radius;

    }

    @Override
    public void display() {
        Shape.super.display();
        System.out.println("Area of Circle is:"+CalculateArea());
    }
}
class Square implements Shape{
      float Side = 7;
      public Square(float Side){
          this.Side = Side;
      }
    @Override
    public double CalculateArea() {
        return Side*Side;
    }

    @Override
    public void display() {
        Shape.super.display();
        System.out.println("Area of square is:"+CalculateArea());
    }
}
class Triangle implements  Shape{
    int h1 = 7;
    int b1 = 8;

    public Triangle(int b1, int h1) {
        this.b1 = b1;
        this.h1 = h1;
    }

    public static void main(String[] args) {

    }

    @Override
    public double CalculateArea() {
        return 1/2*b1*h1;
    }

    @Override
    public void display() {
        Shape.super.display();
        System.out.println("Area of Triangle is:"+CalculateArea());
    }
}