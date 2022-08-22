package stream;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("how are you");
        list.add("goodbye");
        list.add("i am");

        List<Integer> list2 = list.stream().map(String::length).toList();

        List<String> list3 = list.stream().map(String::toUpperCase).toList();

        System.out.println(list2);
        System.out.println(list3);
    }
}
