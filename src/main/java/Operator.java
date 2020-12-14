import java.util.Arrays;
import java.util.function.BiFunction;

public enum Operator {
    PLUS("+", (x, y) -> x + y),
    MINUS("-", (x, y) -> x - y),
    MULTIPLY("*", (x, y) -> x * y),
    DIVIDE("/", (x, y) -> {
        validateDivide(y);
        return x / y;
    });


    private final String operator;
    private final BiFunction<Integer, Integer, Integer> function;

    Operator(String operator, BiFunction<Integer, Integer, Integer> function) {
        this.operator = operator;
        this.function = function;
    }

    public static Operator valueOfSign(String sign) {
        return Arrays.stream(Operator.values())
                .filter(operator -> operator.operator.equals(sign) )
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
    public  int calculate(int x, int y) {
        return this.function.apply(x, y);
    }

    public static void validateDivide(int number) {
        if(number == 0 ) {
            throw new IllegalArgumentException();
        }
    }



}
