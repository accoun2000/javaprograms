package StringDemo;

public class StringMethods
{
    public static void main(String[] args) {
        String str = "Codekul";
        System.out.println("UpperCase:"+str.toUpperCase());
        System.out.println("LowerCase:"+str.toLowerCase());
        System.out.println("CharAt:"+str.charAt(4));
        System.out.println("Concat:"+str.concat("Pvt.ltd."));
        System.out.println("Replace:"+str.replace(str,"Mumbai"));
        System.out.println("ReplaceAll:"+str.replaceAll("Codekul","Mumbai"));

    }
}
