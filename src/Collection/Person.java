package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person implements  Comparable<Person> {
    private String name;
    private Integer Id;
    private Integer age;

    public Person(String name,Integer Id,Integer age){
        this.name = name;
        this.age = age;
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person p) {
        System.out.println("age"+age);
        System.out.println("p.age"+p.age);
        return age.compareTo(p.age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", age=" + age +
                '}';
    }
}
    class Personimpl {
        public static void main(String[] args) {
            List<Person> personList = new ArrayList<>();
            Person p1 = new Person("Sonal",1,21);
            Person p2 = new Person("Monali",4,26);
            Person p3 = new Person("Avinash",2,24);
            Person p4 = new Person("Varsha",3,30);
            personList.add(p1);
            personList.add(p2);
            personList.add(p3);
            personList.add(p4);
            System.out.println(personList);
            Collections.sort(personList);
            for(Person person :personList){
                System.out.println(person);
            }
        }
    }
