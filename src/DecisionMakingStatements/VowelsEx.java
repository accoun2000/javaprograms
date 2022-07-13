package DecisionMakingStatements;

import java.util.Scanner;

public class VowelsEx
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a character:");
    char ch = sc.next().charAt(0);
    //String  ch1 = sc.next();
        switch (ch) {
            case 'a' -> System.out.println("It is a vowel");
            case 'e' -> System.out.println("It is a vowel.");
            case 'i' -> System.out.println("It is a vowel.");
            case 'o' -> System.out.println("It is a vowel.");
            case 'u' -> System.out.println("It is a vowel.");
            default -> System.out.println("It is a consonent.");
        }
    }
}
