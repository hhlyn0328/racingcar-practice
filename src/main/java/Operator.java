import java.util.function.BiFunction;

public enum Operator {
    PLUS("+", (x, y) -> {
        return x + y;
    }),
    MINUS("-", (x, y) -> {
        return x - y;
    }),
    MULTIPLY("*", (x, y) -> {
        return x * y;
    }),
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
        switch (sign) {
            case "+" : return Operator.PLUS;
            case "-" : return Operator.MINUS;
            case "*" : return Operator.MULTIPLY;
            case "/" : return Operator.DIVIDE;
            default:
                throw new IllegalArgumentException();

        }
    }
    public static int calculate(Operator o, int x, int y) {
        return o.function.apply(x, y);
    }

    public static boolean validateDivide(int number) {
        if(number !=0 ) {
            return true;
        }
        throw new IllegalArgumentException();
    }



}
