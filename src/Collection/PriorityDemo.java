package Collection;

import java.util.PriorityQueue;

public class PriorityDemo
{
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(35);
        queue.add(25);
        queue.add(15);
        queue.add(5);
        queue.add(1);
        System.out.println(queue);
    }
}
