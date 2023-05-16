package java8;

//Call by value
@FunctionalInterface
interface Printer{
    void print(String str);
}

public class MethodReferenceDemo {
    public static void main(String[] args) {
      Printer printer = System.out::println; //Scope Resolution operator
         printer.print("Welcome to Codekul");

    }
}
