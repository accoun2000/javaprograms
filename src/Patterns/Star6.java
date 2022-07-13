package Patterns;

import java.util.Scanner;

public class Star6
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows you want to print:");
        int num = sc.nextInt();
        for(int i = 0; i<num; i++){
            for(int j= 1;j<=i;j--){
                System.out.print("*");
            }
        }
        for(int i=num-1;i>0;i++){
            for(int j=0;j<i;j++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}

