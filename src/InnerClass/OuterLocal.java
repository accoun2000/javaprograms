package InnerClass;

public class OuterLocal
{
    void display(){
        class InnerLocal {
            Integer x = 10;
            void show(){
                System.out.println("In local inner class show method");
            }
        }
        InnerLocal innerLocal = new InnerLocal();
        innerLocal.show();
        System.out.println("In outer display method.");
    }
}
class OuterLocalImpl{
    public static void main(String[] args) {
        OuterLocal outerLocal = new OuterLocal();
        outerLocal.display();
    }
}