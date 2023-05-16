package java8;

//foreach Example

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Student
{
    private String name;
    private Integer id;
    private Double percentage;

    public Student(String name, Integer id, Double percentage) {
        this.name = name;
        this.id = id;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Double getPercentage() {
        return percentage;
    }

    @Override
    public String toString() {
        return "Student{"+
                "name='"+name + '\''+
                ",id="+id+
                ",percentage=" + percentage +
                '}';
    }
}
class Studentimpl{
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<Student> distinctionStudent = new ArrayList<>();
        Student s1 = new Student("Aditya",1,77.45);
        students.add(s1);
        Student s2 = new Student("Aishwarya",2,85.39);
        students.add(s2);
        Student s3 = new Student("Sushant",3,95.44);
        students.add(s3);
        Student s4 = new Student("Ankita",4,76.44);
        students.add(s4);
        Student s5 = new Student("Aishwarya",5,85.39);
        students.add(s5);

//        for(Student s : students){
//            if(s.getPercentage() > 80){
//                distinctionStudent.add(s);
//                System.out.println("Name" + s.getName());
//            }
//        }
        distinctionStudent = students.stream()
                .filter(student -> student.getPercentage()>80)
               // .limit(2)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctionStudent);

        List<String> names = Arrays.asList("Ash","Sam","Om","Ash");
        System.out.println("names list "+names.stream().distinct().collect(Collectors.toList()));



    }
}
