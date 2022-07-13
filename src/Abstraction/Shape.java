package Abstraction;

public abstract class Shape {
    abstract double CalculateArea();

    void display() {
        System.out.println("Calculating Area of different shapes:");
    }
}
class Rectangle extends Shape{
    int breadth;
    int height;

    public Rectangle(int breadth, int height) {
        this.breadth = breadth;
        this.height = height;
    }

    double CalculateArea(){
        return breadth*height;
    }
    void display(){
        super.display();
        System.out.println("Area of Rectangle:"+CalculateArea());
    }
}
class Shapeimpl{
    public static void main(String[] args){
        Shape shape = new Rectangle(5,7);
        shape.display();
    }
}
