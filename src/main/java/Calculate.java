public class Calculate {
    public static int calculate(int firstNo, String sign, int lastNo) {

        switch (sign) {
            case "+" :
                return Operator.PLUS.calculate(firstNo, lastNo);
            case "-" :
                return Operator.MINUS.calculate(firstNo, lastNo);
            case "*" :
                return Operator.MULTIPLY.calculate(firstNo, lastNo);
            case "/" :

                if(lastNo == 0) {
                    throw new IllegalArgumentException();
                }
                return Operator.DIVIDE.calculate(firstNo, lastNo);
            default:
                throw new IllegalArgumentException();

        }
    }
}
