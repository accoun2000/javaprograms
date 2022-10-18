//count the number of digits.

package Practice;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args) {
        int count = 0;
        int n = 762343546;

        while (n != 0){
            n = n / 10;
           ++count;
    }
            System.out.println("Total digits:" + count);
        }
    }

