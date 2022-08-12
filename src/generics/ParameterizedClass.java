package generics;

public class ParameterizedClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("hello");
        System.out.println(info1);
        Info<Integer> info2 = new Info<>(18);
        System.out.println(info2);
    }
}

class Info<T> {
    private T t;
    public Info(T t) {
        this.t = t;
    }

    public String toString() {
        return "{[" + t + "]}";
    }

    public T getValue() {
        return this.t;
    }
}