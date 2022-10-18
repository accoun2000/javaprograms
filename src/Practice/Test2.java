//toggle the cases of string.

package Practice;

public class Test2 {

    public static void main(String[] args) {
        String s = "CoDeKuL123";
        if (!s.isEmpty()) {
            char[] chr = s.toCharArray();
            for (int i = 0; i < chr.length;i++) {
                int asciiValue = chr[i];

                if(asciiValue >= 97 && asciiValue <= 122 ){
                    asciiValue = asciiValue-32;
                    System.out.println((char)asciiValue);
                } else if (asciiValue >= 65 && asciiValue <= 90) {
                    asciiValue = asciiValue + 32;
                    System.out.println((char)asciiValue);
                }
                else {
                    System.out.println();
                    System.out.println(chr[i]+"Invalid input.");
                }
            }
        }
    }
}
