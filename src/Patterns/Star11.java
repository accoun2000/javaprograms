package Patterns;

import java.util.Scanner;

public class Star11 {
    public static void main(String[] args) {
        int i, j, k, space = 1;
        System.out.println("Enter no of rows:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        space = n - 1;
        for (j = 1; j <= n; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
