//Java Program to print the duplicate elements of an array
package Array;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 7, 2, 3, 1, 2, 6};
        System.out.println("Duplicate elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                    break;
                }
            }
        }
    }
}
