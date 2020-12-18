package calculator;

import java.util.function.BiFunction;

public enum Operator {

    PLUS("+", (x, y) -> x + y),
    MINUS("-", (x, y) -> x - y),
    DIVISION("/", (x, y) -> {
        if (0 == y) {
            throw new IllegalArgumentException();
        }

        return x / y;
    }),
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

    public static Operator valueOfSymbol(String symbol) {
        for (Operator operator : Operator.values()) {
            if (operator.operator.equals(symbol)) {
                return operator;
            }
        }

        throw new IllegalArgumentException();
    }
}
