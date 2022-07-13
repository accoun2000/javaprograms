package accessmodifierEx;

public class Bike {
    String name;
    double price;
    protected String model;
        void show () {
            System.out.println("In Bike show");
        }
    }
    class Bikeimpl{
        public static void main(String[] args) {
            Bike bike = new Bike();
            bike.price = 532;
            bike.model = "RS15";
        }
    }
