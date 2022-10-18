package StringDemo;

public class StringMethods3
{
    public static void main(String[] args) {
        String str = new String("Sanjana Sandip Patil");
        for(int i = 0;i<str.length();i++){
            if (str.charAt(i) == 'a'|| str.charAt(i) == 'e'||
                    str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u')
                System.out.println("Given String contains :" +str.charAt (i) + " at the index " +i);



        }
    }
}
