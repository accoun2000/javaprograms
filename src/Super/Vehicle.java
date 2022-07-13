package Super;
//to invoke parent class constructor
public class Vehicle
{
    int VehicleCode;
    String VehicleType;

    public Vehicle(int vehicleCode, String vehicleType)
    {
        VehicleCode = vehicleCode;
        VehicleType = vehicleType;
    }
}
class Bike extends Vehicle
{
    String bikename;
    String brand;
    String model;

    public Bike(int vehicleCode, String vehicleType, String bikename, String brand, String model)
    {

        super(vehicleCode, vehicleType);
        //this(101,"Bike","Splender","Hero","125CC");
        this.bikename = bikename;
        this.brand = brand;
        this.model = model;
    }
    void display()
    {
        System.out.println("Vehicle code:"+super.VehicleCode);
        System.out.println("VehicleType:"+super.VehicleType);
        System.out.println("BikeName:"+bikename);
        System.out.println("Brand:"+brand);
        System.out.println("Model:"+model);
    }
}
class Vehicleimpl
{
    public static void main(String[] args){
        Bike bike = new Bike(101,"Bike","Splender","Hero","125CC");
        bike.display();
    }
}