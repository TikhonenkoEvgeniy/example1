package stream;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] array = {15, 5, 7, 35, 1, 21, 3, 6, 4, 11};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));
    }
}
