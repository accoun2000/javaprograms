package InnerClass;

public abstract class Parking
{
  void allowVehicle(String vehicletype){
      System.out.println("You can park your vehicle.");
  }
}
class ParkingImpl{
    public static void main(String[] args) {
        Parking parking = new Parking() {
            @Override
            void allowVehicle(String vehicletype) {
                System.out.println(vehicletype.equals("Bike")?"two wheeler are not allowed":"You can park your car");
            }
        };
        parking.allowVehicle("Bike");
    }
}