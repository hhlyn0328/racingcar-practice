public class Calculator {
    public static int calculate(int firstNo, String sign, int lastNo) {
        return Operator.calculate(Operator.valueOfSign(sign), firstNo, lastNo);
    }
}
