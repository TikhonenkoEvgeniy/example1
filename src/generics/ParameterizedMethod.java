package generics;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        int a = GenericMethod.getSecondElement(arrayList);
        System.out.println(a);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("fsdfsfs");
        arrayList2.add("jgjgjghhb");
        arrayList2.add("zczxvb");
        String b = GenericMethod.getSecondElement(arrayList2);
        System.out.println(b);
    }
}

class GenericMethod {
    public static <T> T getSecondElement(ArrayList<T> arrayList) {
        return arrayList.get(1);
    }
}