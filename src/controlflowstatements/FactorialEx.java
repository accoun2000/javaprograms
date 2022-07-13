package controlflowstatements;

import java.util.Scanner;

public class FactorialEx
{
    public static void main(String[] args)
    {
        int fact = 1;
        //int num = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num:");
        int num = sc.nextInt();
        for(int i = 1; i<=num; i++){
        fact = fact * i;
    System.out.println("The factorial of the given number is :"+fact);

    }
    }
}
