package thisKeyword;

public class Car
{
    int CarNo;
    String CarName;
    double price;
    Car(int CarNo,String CarName,double price){
        this.CarNo = CarNo;
        this.CarName = CarName;
        this.price = price;
    }

    public Car(double price) {
        this.price = price;
        CarName = CarName;
        CarNo = CarNo;
    }

    void display(){
        System.out.println("**********Car Details***********");
        System.out.println("CarNo:"+CarNo);
        System.out.println("CarName:"+CarName);
        System.out.println("price:"+price);
    }
}
class CarImpl{
    public static void main(String[] args)
    {
       Car c1 = new Car(101,"Maruti",400000);
       c1.display();
    }
}