//sum of n natural numbers:-
package Practice;

import java.util.Scanner;

public class NaturalNumbers {
    public static int sumnum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Sum of all the numbers is:"+sumnum(n));
    }
}