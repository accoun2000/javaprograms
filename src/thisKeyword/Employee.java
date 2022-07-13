package thisKeyword;

public class Employee
{
    int Id;
    String name;
    int phnno;

    Employee(int Id, String name , int phnno)
    {
       this.Id = Id;
       this.name = name;
       this.phnno = phnno;
    }
    public Employee(int Id)
    {
       this.Id = Id;
       name = name;
       phnno = phnno;
    }
    void display(){
        System.out.println("*****Employee Details*****");
        System.out.println("Id:"+Id);
        System.out.println("name:"+name);
        System.out.println("phnno:"+phnno);
    }
}
class Employeeimpl{
    public static void main(String[] args){
        Employee e1 = new Employee(1,"Aishwarya",767465273);
        e1.display();
    }
}