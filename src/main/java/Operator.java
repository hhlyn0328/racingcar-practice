import java.util.function.BiFunction;

public enum Operator {

    PLUS("+", (x, y) -> x + y),
    MINUS("-", (x, y) -> x - y),
    DIVISION("/", (x, y) -> x / y),
    MULTIPLY("*", (x, y) -> x * y);

    private final String operator;
    private final BiFunction<Integer, Integer, Integer> function;

    Operator(String operator, BiFunction<Integer, Integer, Integer> function) {
        this.operator = operator;
        this.function = function;
    }

    public int calculate(int x, int y) {
        return this.function.apply(x, y);
    }
}
