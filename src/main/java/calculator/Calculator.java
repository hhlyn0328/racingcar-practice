package calculator;

public class Calculator {
    public static int calculate(int firstNo, String sign, int lastNo) {
        return Operator.valueOfSign(sign).calculate(firstNo, lastNo);
    }
}
