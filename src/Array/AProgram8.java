package Array;

public class AProgram8
{
    public static void main(String[] args) {
        int[] arr = new int[]{34,2,454,4,566,235,46,5676,4544,234,56,67};
        for(int i= 0;i<arr.length;i++)
        {
            System.out.println("Given Array:");
        }
        System.out.println("Elements at odd number:");
        for(int i= 0;i<arr.length;i = i + 2)
        {
           System.out.println(arr[i]+" ");
        }
    }
}
