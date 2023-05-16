package Patterns;

public class Star12
{
    public static void main(String[] args) {
        int size = 5;
        int alpha = 65;

        for(int i = 1;i <= size;i++){
            for(int j = size;j > i;j--){
                System.out.println("");
            }
            for(int k = 0;k < i*2-1;k++){
                System.out.print((char)(alpha+k));
            }
            System.out.println();
        }
        for(int i = 1;i<=size;i++){
            for(int j = 0;j<i;j++){
                System.out.println("");
            }
            for(int k = 0;k<(size-i*2-1);k++){
             System.out.println((char)(alpha + k));
            }
            System.out.println();
        }
    }
}
