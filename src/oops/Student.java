package oops;

import java.util.Scanner;

public class Student
{
    int rollno;
    String name;
    String address;
    float age;

    void insertData(int rollno, String nm,String addr,float a)
    {
        this.rollno = rollno;
        name = nm;
        address = addr;
        age = a;
    }
    void display(){
        System.out.println("**********Student details************");
        System.out.println("rollno:"+rollno);
        System.out.println("name:"+name);
        System.out.println("address:"+address);
        System.out.println("age:"+age);
    }
    {
}
}
    class StudentImpl
    {
        public static void main(String[] args)
        {
            Student s1 = new Student();                                     //s1 = reference variable
            s1.rollno = 1;
            s1.name = "Amit";
            s1.address = "kothrud , pune";
            s1.age = 5.5f;

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter rollno:");
            int rollno = sc.nextInt();

            System.out.println("Enter name:");
            String nm = sc.next();

            System.out.println("Enter address:");
            String address = sc.next();

            System.out.println("Enter age:");
            float age = sc.nextFloat();

            Student s2 = new Student();
            s2.insertData(rollno,nm,address,age);
            s2.insertData(rollno = 4, nm = "Aishwarya",address = "Kothrud,Pune",age = 7.5f);
            s2.display();

        }
    }
