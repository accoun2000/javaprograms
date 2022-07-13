package interfaceDemo;

public interface Vehicle{

}
interface Engine{

}
class Car implements Vehicle {
    void show() {
        Boolean isVehicle;
    }
}
    class Bike implements Engine {
        Boolean isEngine;
    }

    class Vehicleimpl {
        public static void main(String[] args) {
            Car car = new Car();
            Bike bike = new Bike();
            if (bike instanceof Vehicle) {
                System.out.println("Is a vehicle");
            } else {
                System.out.println("Is not a vehicle");
            }
        }
    }






