package java8;

import java.util.Locale;
import java.util.Optional;

public class OptionalDemo
{
    public static void main(String[] args) {
        Optional<String> middlename = Optional.empty();
        if(middlename.isPresent()){
            System.out.println(middlename.get().toUpperCase());
        }
        else{
            System.out.println("middle name is not present");
        }
        Optional<String []> str = Optional.empty();
        if(str.isPresent()){
            System.out.println(str.get()[5].toUpperCase());
        }
        else {
            System.out.println("String is Empty");
        }
    }
}
