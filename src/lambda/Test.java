package lambda;

public class Test {
    public static void main(String[] args) {
        print("ssss", 5, (x, y) -> { return x.length() + y; });
    }

    static void print(String s, int i, Lambda lambda) {
        System.out.println(lambda.method(s, i));
    }
}
