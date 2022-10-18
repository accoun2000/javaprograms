package StringDemo;

public class StringDemo
{
    public static void main(String[] args) {
        //by using literal
        String str1 = "Pune";
        //by using new keyword
        String str2 = new String("Pune");
        String str3 = "Pune";
        String str4 = new String("Pune");

        if(str1 == str3)     //== :- checks whether strings have same memory address
            System.out.println("Both are Equal");
        else
            System.out.println("Different String");
        if(str1.equals(str2))
            System.out.println("Equals");               //equals :-
        else
        System.out.println("Not Equals");
        {

        }
    }
}
