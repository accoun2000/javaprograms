package StringDemo;

public class StringEquals
{
    public static void main(String[] args) {
        String s1 = "Pune";
        String s2 = "Mumbai";

        String s3 = new String("Pune");
        String s4 = new String("Mumbai");

        if(s1 == s2)
            System.out.println("True");
            else{
                System.out.println("False");
            }
            if(s1.equals(s2))
                System.out.println("True");
            else{
                System.out.println("False");
            }
            System.out.println(s2.compareTo(s3));

        }
    }

