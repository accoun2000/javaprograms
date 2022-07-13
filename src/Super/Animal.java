package Super;
//to invoke parent class method.
public class Animal
{
    void eat(){
        System.out.println("eating....");
    }
}
class Dog extends Animal{
    void run(){
        super.eat();
        System.out.println("running");
    }
}
class Animalimpl{
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.run();

    }
}
