package Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo
{
    public static void main(String[] args) {
        Deque<String> cities = new LinkedList<>();
        Deque<String> cities1 = new ArrayDeque<>();
        cities.addFirst("Pune");
        cities.addFirst("Mumbai");
        cities.offerFirst("Nagpur");
        cities.offerLast("Karad");
        System.out.println(cities);
        System.out.println(cities.peekFirst());
        System.out.println(cities.peekLast());

    }
}
