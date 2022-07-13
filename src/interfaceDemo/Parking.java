package interfaceDemo;

public interface Parking
{

}
class Twowheeler implements Parking {
    void show(){
        System.out.println("Allow");
    }
}
class Fourwheeler{
    void show(){
        System.out.println("Dont Allow");
    }
}
class Parkingimpl{
    public static void main(String[] args) {
        Twowheeler twowheeler = new Twowheeler();
        Fourwheeler fourwheeler = new Fourwheeler();
        if(twowheeler instanceof Parking) {
            twowheeler.show();
        }else{
            fourwheeler.show();
        }
    }
}
        