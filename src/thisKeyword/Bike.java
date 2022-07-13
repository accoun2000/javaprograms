package thisKeyword;

public class Bike
{
    int bikeNo;
    String bikeName;
   public Bike()
   {
        this(101,"Activa");
        System.out.println("in default constructor");
    }

    public Bike(int bikeNo , String bikeName)
    {
        System.out.println("in parametrised constructor");
        this.bikeNo = bikeNo;
        this.bikeName = bikeName;
    }
    void display()
    {
       System.out.println("Bike Details");
       System.out.println("bike No.:"+bikeNo);
       System.out.println("bike Name:"+bikeName);
    }
     class Bikeimpl{
       public static void main(String[] args){
           Bike bike = new Bike();
           bike.display();
       }
    }
}
