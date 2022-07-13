package Constructor;

public class Employee
{
    int id;
    String name;
    String CompanyName;
    Employee(){
        System.out.println("In Default Constructor");
    }
    void display(){
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
        System.out.println("CompanyName:"+CompanyName);
    }
}
class Employeeimpl{
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.display();
        Employee e2 = new Employee();
        e2.display();
    }
}