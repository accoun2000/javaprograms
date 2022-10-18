package Encapsulation;

import java.util.Scanner;

public class Person
{
    private int pid;
    private String firstname;
    private String lastname;
    private String fullname;

    public void setpid(int pid){
        this.pid = pid;
    }
    public int getpid(){
        return pid;
    }

    public String getFirstname(String aditya) {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFullname() {
        return fullname;                 //return firstname+" "+lastname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}
class Personimpl{
    public static void main(String[] args) {
        Person person = new Person();
        person.getpid();
        person.setFullname("Shubham Dilip Patil");
        person.setFirstname("Shubham");
        person.setLastname("Patil");

        System.out.println("Pid: "+person.getpid());
        System.out.println("Full Name: "+person.getFullname());
    }
}