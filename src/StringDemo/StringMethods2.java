package StringDemo;

public class StringMethods2
{
    public static void main(String[] args) {
        String str = "Break Diving is an amazing website where you can meet" +
                "people who can help you in pursuing your dreams and ambitions.";
        System.out.println(str.trim());
        System.out.println(str.charAt(54));
        System.out.println(str.startsWith("B"));
        System.out.println(str.endsWith("s"));
        System.out.println(str.split(str));
    }
}
