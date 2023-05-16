package Collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo
{
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Aditya");
        map.put(2,"Aishwarya");
        map.put(3,"Sushant");
        map.put(4,"Sanjana");
        System.out.println(map);
        map.put(null,null);
        System.out.println(map);
        map.put(null,"Tejas");
        System.out.println(map);
        //internal working of hashmap and hashcode
        System.out.println(map.get(4));
        System.out.println(Collections.addAll(map.values()));
        Iterator iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        map.remove(2);
        System.out.println(map);
     }
}
