package Statickeyword;

public class Student
{
    int rollno;
    String Name;
    static String SchoolName;
    void display(){
        System.out.println(rollno+":"+Name+":"+SchoolName+"");
    }

    //public Student(int rollno, String name) {
      //  this.rollno = rollno;
        //Name = name;
    }


class Studentimpl{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.Name = "Amit";
        s1.rollno = 01;
        s1.SchoolName = "JJ Highschool";

        Student s2 = new Student();
        s2.Name = "Bunny";
        s2.rollno = 02;
        s2.SchoolName = "JJ Highschool";

        Student s3 = new Student();
        s3.Name = "Chinu";
        s3.rollno = 03;
        s3.SchoolName = "JJ Highschool";

        s1.display();
        s2.display();
        s3.display();
    }
}
