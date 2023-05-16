package Collection;

import java.util.TreeSet;

public class TreeSetDemo
{
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(78);
        numbers.add(46);
        numbers.add(49);
        numbers.add(99);
        numbers.add(89);
        System.out.println(numbers);
        //numbers.add(null);

        System.out.println(numbers.ceiling(100));
    }
}
