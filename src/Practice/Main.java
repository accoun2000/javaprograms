package Practice;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        System.out.println("Enter the year:");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year % 4 == 0){                                   //if year % 400 == 0
                    System.out.println("Yes");               //if year % 100 == 0
                }
                else{
                    System.out.println("No");
                }

            }
        }

