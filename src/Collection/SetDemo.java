package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo
{
    public static void main(String[] args) {
        Set<String> country = new HashSet<>();
        Set<String> states = new HashSet<>();
        country.add("India");
        country.add("Australia");
        country.add("Nepal");
        country.add("China");
        country.add(null);
        states.add("Maharashtra");
        states.add("Uttar Pradesh");
        states.add("India");
        System.out.println(country);
        country.addAll(states);//union

        System.out.println(country);
        country.retainAll(states);//intersection
        System.out.println(country);
    }
}
