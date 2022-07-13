package association;

public class VehicleEx {
    int wheels;
    String vehicletype;
    String brand;
}

class Car extends VehicleEx {
    String segment;
    String model;
    String variant;
    Engine engine;
    MPlayer mPlayer;
}

class Engine {
    int stroke;
    String enginetype;
    int cc;
}

class MPlayer {
    String companyname;
    double price;
}

class Vehicleimpl {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Suzuki";
        car.vehicletype = "Car";
        car.model = "Swift";
        car.segment = "Hashback";
        car.variant = "Diesel";

        Engine suzukiEngine = new Engine();
        suzukiEngine.enginetype = "BS6";
        suzukiEngine.cc = 1296;
        suzukiEngine.stroke = 4;
        car.engine = suzukiEngine;
        MPlayer sonyPlayer = new MPlayer();
        sonyPlayer.companyname = "Sony";
        sonyPlayer.price = 3400;
        car.mPlayer = sonyPlayer;
    }
}