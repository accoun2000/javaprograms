package StringDemo;

public class Immutable
{
    public static void main(String[] args) {
        String s1 = "Pune";
        String s2 = "Pune";
        s1 = "Mumbai";
        System.out.println(s1);
        System.out.println(s2);
        int n1 = 10;
        int n2 = n1;
        n1 = 15;
        System.out.println(n1);
        System.out.println(n2);
    }
}
