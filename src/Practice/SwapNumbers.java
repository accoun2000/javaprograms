package Practice;

import java.util.Scanner;

public class SwapNumbers
{
    public static void main(String[] args) {
        //float first = 1.25f , second = 3.24f;
        System.out.println("Enter first number:");
        System.out.println("Enter second number:");
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();

         System.out.println("---Before swapping numbers---");
         System.out.println("--First Number--"+first);
         System.out.println("--Second Number--"+second);

         float temp = first;
         first = second;
         second = (int)temp;

         System.out.println("---After swapping---");
         System.out.println("--First number--"+first);
         System.out.println("--Second number--"+second);
    }
}
