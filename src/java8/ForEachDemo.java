package java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachDemo
{
    public static void main(String[] args){
        //List
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        numbers.forEach(n-> System.out.println(n));                  //has interface consumer
        ConsumerImpl ci = new ConsumerImpl();                          //has only one abstract method accept
        for(Integer n :numbers)
            ci.accept(n);

        //map
        Map<Integer,String> map = new HashMap<>();                     //has interface biconsumer
        map.put(1,"Pune");                                              //has one abstract method accept.
        map.put(2,"Mumbai");
        map.put(3,"Karad");
        map.forEach((k,v)-> System.out.println("Key"+k +"Value"+v));
    }
}
class ConsumerImpl implements Consumer<Integer>{

    @Override
    public void accept(Integer n) {
        System.out.println(n);
    }
}
