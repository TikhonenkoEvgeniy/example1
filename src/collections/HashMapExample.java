package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Student st1 = new Student("Evgeniy", 5);
        Student st2 = new Student("Andrey", 2);
        Student st3 = new Student("Mariya", 3);
        Student st4 = new Student("Katya", 1);
        Student st5 = new Student("Gleb", 4);

        Map<Student, Double> map = new HashMap<>();
        map.put(st1, 4.3);
        map.put(st2, 3.9);
        map.put(st3, 4.8);
        map.put(st4, 3.3);
        map.put(st5, 4.4);

        for (Map.Entry<Student, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

class Student {
    private final String name;
    private final int course;

    Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}