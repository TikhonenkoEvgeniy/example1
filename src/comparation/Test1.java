package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Eugene");
        list.add("Andrey");
        list.add("Maria");
        System.out.println("Before sort:");
        System.out.println(list);
        System.out.println("After sort:");
        Collections.sort(list);
        System.out.println(list);
    }
}
