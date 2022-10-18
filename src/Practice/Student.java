package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {


    public Student(Integer id, String fName, String mName, String lName, String mbl) {
    }

    public static void main(String[] args) {
        List<String> Studentlist = new ArrayList<>();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Id:");
       int Id = sc.nextInt();

       System.out.println("Enter Firstname:");
       String fname = sc.next();

       System.out.println("Enter Middlename:");
       String mname = sc.next();

       System.out.println("Enter Lastname:");
       String lname = sc.next();

       System.out.println("Enter contactNo:");
       int CNo = sc.nextInt();

       System.out.println("Enter next Id:");
       System.out.println("1.Yes");
       System.out.println("2.No");
       String A = null;
       int choice = sc.nextInt();
       switch(choice){
           case 1:
               System.out.println("Enter next Id:");
               A = sc.next();
               break;

           case 2:
               System.out.println("Your entered ID is:"+Id);
               break;
           default:
               System.out.println("Select either 1 or 2:");
               break;
       }
       if(choice == 1){
           Studentlist.add(A);
           Studentlist.add(String.valueOf(Id));
           Studentlist.add(fname);
           Studentlist.add(mname);
           Studentlist.add(lname);
           Studentlist.add(String.valueOf(CNo));
       }
       else{
           Studentlist.add(String.valueOf(Id));
           Studentlist.add(fname);
           Studentlist.add(mname);
           Studentlist.add(lname);
           Studentlist.add(String.valueOf(CNo));
       }
    }
}