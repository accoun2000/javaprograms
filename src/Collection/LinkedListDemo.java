package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo
{
    public static void main(String[] args) {
        //List<String> fruits = new LinkedList<>();
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Grapes");
        fruits.add("Banana");
        fruits.add("Chickoo");
        System.out.println("fruits");
        fruits.addFirst("Watermelon");
        fruits.addLast("Orange");
        Iterator iterator = fruits.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        Iterator descIterator = fruits.descendingIterator();
                while (descIterator.hasNext()){
                    System.out.println(descIterator.next()+" ");
                }
                System.out.println(fruits.offer("Orange"));
                System.out.println(fruits);
                System.out.println(fruits.peek());
                System.out.println(fruits.peekFirst());
                System.out.println(fruits.peekLast());
    }
}
