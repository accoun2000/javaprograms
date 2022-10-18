package StringDemo;

public class Person {
    int PId;
    private String name;
    private int mobileno;
    private String email;

    @Override
    public String toString() {
        return "Person{" +
                "  PId=" + PId +
                ", name='" + name + '\'' +
                ", mobileno=" + mobileno +
                ", email='" + email + '\'' +
                '}';
    }
        public static void main(String[] args){
            Person p = new Person();
            p.PId = 1234;
            p.name = "Abc";
            p.email = "defdsv";
            p.mobileno = 876473482;
            System.out.println(p.toString());
        }
    }

