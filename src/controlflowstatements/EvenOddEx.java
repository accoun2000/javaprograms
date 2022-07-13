package controlflowstatements;

import java.util.Scanner;

public class EvenOddEx
{
    public static void main(String[] args)
    {
       // int num = 23;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num:");
        int num = sc.nextInt();
        {
            if (num % 2 == 0)
                System.out.println("NUmber is even.");
            else
                System.out.println("Number is Odd.");
        }
    }
}