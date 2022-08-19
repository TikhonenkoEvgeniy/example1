package generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<?> list = new ArrayList<String>();

        List<String> list1 = new ArrayList<>();
        list1.add("first");
        list1.add("second");
        list1.add("third");
        showList(list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(43);
        list2.add(255);
        list2.add(7);
        showList(list2);

        ArrayList<Double> list3 = new ArrayList<>();
        list3.add(43.6);
        list3.add(255.4);
        list3.add(7.14);
        System.out.println(sum(list3));

    }

    public static Double sum(ArrayList<? extends Number> arrayList) {
        double sum = 0;
        for (Number n : arrayList) {
            sum = sum + n.doubleValue();
        }
        return sum;
    }

    public static void showList(List<?> list) {
        System.out.println("Elements from list: " + list);
    }
}
