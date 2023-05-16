//Java Program to print the elements of an array in reverse order
package Array;

public class AProgram6 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Original Array:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println(" Reverse Order:");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]+" ");
        }
    }
}
