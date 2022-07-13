package Abstraction;

public abstract class Shape2
{
    abstract double calculateArea();

    void display()
    {
        System.out.println("Calculating area of different shapes:");
    }
}
    class square extends Shape2 {
        int side;

        public square(int side) {
            this.side = side;
        }

        @Override
        double calculateArea() {
            return side * side;
        }

        void display() {
            super.display();
            System.out.println("Area of square is:" + calculateArea());
        }
    }
        class Shape2impl
        {
            public static void main(String[] args){
                Shape2 shape = new square(6);
                shape.display();
            }
        }




