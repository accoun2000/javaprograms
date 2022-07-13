package Abstraction;

public abstract class Vehicle
{
    abstract void start();
    Vehicle()
    {
        System.out.println("In vehicle constructor");
    }
    static void show()
    {
        System.out.println("In show method");
    }
    final void stop()
    {
        System.out.println("In stop method");
    }
    void drive()
    {
        System.out.println("In drive method");
    }
}
class Car extends Vehicle{

    @Override
    void start() {
        super.drive();
    }

    @Override
    void drive() {
        super.drive();
    }
    static void show(){
        System.out.println("In Car show method");
    }
}
class Vehicleimlp{
    public static void main(String[] args){
        Vehicle v1 = new Car();
        v1.start();
        v1.drive();
        v1.stop();
        Vehicle.show();
    }
}