package controlflowstatements;

public class NumberdivisibleEx
{
    public static void main(String[] args)
    {
        System.out.println("Numbers divisible by 3:");
        for (int i = 1; i <= 20; i++)
        {
            if (i % 3 == 0)
            {
                System.out.println(i + ",");
            }
        }
        System.out.println("Numbers divisible by 5:");
        for(int i = 1 ; i <= 20;i++)
        {
            if(i % 5 == 0){
                System.out.println(i+",");
            }
        }
        System.out.println("Numbers divisible by 3 and 5:");
        for(int i = 1 ; i <= 20 ; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i+",");
            }

    }
    }
}

