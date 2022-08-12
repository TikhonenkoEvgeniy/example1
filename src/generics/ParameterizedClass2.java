package generics;

public class ParameterizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("hello", 5);
        System.out.println("First value: " + pair.getFirst() + ", second value: " + pair.getSecond());
    }
}

class Pair<V1, V2> {
    private V1 v1;
    private V2 v2;

    public Pair(V1 v1, V2 v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public V1 getFirst() {
        return this.v1;
    }

    public V2 getSecond() {
        return this.v2;
    }
}
