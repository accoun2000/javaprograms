package Statickeyword;

public class Employee
{
    int empNo;
    String empName;
    static String CompanyName;
    static void show(){
        CompanyName = "codekul";

    }
    void display(){
        CompanyName = "codekul";
    }
}
class Employeeimpl{
    public static void main(String[] args) {
        Employee.show();
        Employee e = new Employee();
    }
}
