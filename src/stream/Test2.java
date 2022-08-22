package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(2);
        list.add(6);

        int result = list.stream().reduce((accumulator, element) -> accumulator * element).get();
        System.out.println(result);

        Optional<Integer> optionalInteger = list.stream().reduce((accumulator, element) -> accumulator * element);
        if (optionalInteger.isPresent()) {
            System.out.println(optionalInteger.get());
        } else {
            System.out.println("Not element");
        }
    }
}
