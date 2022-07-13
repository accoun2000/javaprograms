package DecisionMakingStatements;

import java.util.Scanner;

public class CalculatorEx
{
    public static void main(String[] args)
    {
    int no1,no2;
        Scanner scanner = new Scanner(System.in);
        char ch;
        int result;
        do{
            System.out.println("Enter no1:");
            no1 = scanner.nextInt();
            System.out.println("Enter no2:");
            no2 = scanner.nextInt();
            System.out.println("Addition");
            System.out.println("Substraction");
            System.out.println("Division");
            System.out.println("Multiplication");
            System.out.println("Modulo");
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:result = no1+no2;
                    System.out.println("Addition is =" +result);
                break;
                case 2:result = no1-no2;
                    System.out.println("Substraction is =" +result);
                    break;
                case 3:result = no1/no2;
                    System.out.println("Division is =" +result);
                    break;
                case 4:result = no1*no2;
                    System.out.println("Multiplication is =" +result);
                    break;
                case 5:result = no1%no2;
                    System.out.println("Modulo is =" +result);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
            System.out.println("Do you want to continue?");
            ch = scanner.next().charAt(0);
        }
        while(ch == 'Y'|| ch == 'y');

    }
}
