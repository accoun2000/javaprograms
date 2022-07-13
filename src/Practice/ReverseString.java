package Practice;

public class ReverseString
{
    public static void main(String[] args)
    {

    String name= "Sanjana";
    int length = name.length();
    String rev = " ";
        int i;
        for(i=length-1;i >= 0;i--);
        {
            rev = rev + name.charAt(i);
        }
        System.out.println("Reverse of "+name+"is"+rev);
    }
}
