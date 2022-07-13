package Encapsulation;

public class Person
{
    private int pid;
    private String firstname;
    private String lastname;
    private String fullname;

    public void setpid(int pid){
        this.pid = pid;
    }
    public int getpid(int i){
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
        person.getpid(119);
        person.setFullname("Shubham Dilip Patil");
        person.setFirstname("Shubham");
        person.setLastname("Patil");
    }
}