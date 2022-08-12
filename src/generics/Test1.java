package generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        /*
        list.add("Ok");
        list.add(5);
        list.add(new StringBuilder("fmskfkdg"));

         */

        list.add("hello");
        list.add("ok");
        list.add("how are you");
        list.add("bye");


        for (Object s : list) {
            System.out.println(s);
        }
    }
}
