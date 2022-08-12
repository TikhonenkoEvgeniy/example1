package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee employee1 = new Employee(505, "Eugene", "Tikhonenko", 2000);
        Employee employee2 = new Employee(203, "Andrey", "Sidorov", 3000);
        Employee employee3 = new Employee(455, "Mariya", "Petrova", 2500);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        System.out.println("Before sort:");
        System.out.println(list);
        System.out.println("After sort:");
        Collections.sort(list);
        System.out.println(list);
    }
}

