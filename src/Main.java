import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        String str = "def"; // 100 + 101 + 102 = 303

        Function<String, char[]> fun1 = a -> a.toCharArray();
        Function<char[], Integer> fun2 = a -> {
            int result = 0;
            for (int i = 0; i < a.length; i++) {
                result += a[i];
            }
            return result;
        };

        Function<String, Integer> fun3 = fun2.compose(fun1);
        System.out.println(fun3.apply(str));
    }
}
