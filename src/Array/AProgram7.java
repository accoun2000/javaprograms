//Java Program to print the elements of an array present on even position
package Array;

public class AProgram7 {
    public static void main(String[] args) {
        int[] arr = new int[]{34, 45, 34, 23, 57, 85, 78, 56, 46, 35,};
        System.out.println("Given array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at the even position:");

            for (i = 0; i < arr.length; i = i + 2) {
                System.out.println(arr[i] + "");
            }
        }
    }
}