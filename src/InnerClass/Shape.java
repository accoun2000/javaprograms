package InnerClass;

public class Shape
{
    String shapeName;
    static class Circle{            //static inner class
        int radius;
    }
}
class ShapeImpl{
    public static void main(String[] args) {
     Shape shape = new Shape();
     shape.shapeName = "Circle";
     Shape.Circle circle = new Shape.Circle();
     circle.radius = 5;
    }
}
