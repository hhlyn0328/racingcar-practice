public class Calculate {
    private static String sign;
    private static int firstNo;
    private static int lastNo;

    public Calculate(int firstNo, String sign, int lastNo) {
        this.firstNo = firstNo;
        this.lastNo = lastNo;
        this.sign = sign;
    }

    public static int calculate() {

        switch (sign) {
            case "+" :
                return firstNo + lastNo;
            case "-" :
                return firstNo - lastNo;
            case "*" :
                return firstNo * lastNo;
            case "/" :
                return firstNo / lastNo;
        }
        return 0;
    }
}
