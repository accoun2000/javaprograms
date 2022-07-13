package controlflowstatements;

import java.util.Scanner;

public class PrimeNumberEx {
    public static void main(String[] args) {
        //int number = 7;
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int number = sc.nextInt();
        for (int i = 2; i <= number - i; i++) {
            if (number % 2 == 0) {
                temp = temp + 1;
            }
        }
        if (temp > 0) {
            System.out.println("Number is not prime.");
        }
        else
        {
            System.out.println("Number is prime.");
        }
    }
}


