package Constructor;

public class Person
{
    int id;
    String name;

    Person(){
        System.out.println("Default Constructor.");
    }
    Person(String nm){
        name = nm;
    }
    Person(int i,String nm){
        id = i;
        name = nm;
    }
    void display(){
        System.out.println("id:"+id);
        System.out.println("name:"+name);
    }
}
class Personimpl{
    public static void main(String[] args){
        Person p1 = new Person(1,"Zen");
        p1.display();
        Person p2 = new Person("John");
        Person p3 = new Person();
        p3.display();
    }
}
