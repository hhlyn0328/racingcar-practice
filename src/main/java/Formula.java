import java.util.List;

public class Formula {
    private final String[] formula ;
    private int idx = 0 ;
    private int firstNo = 0;
    private String sign;
    private int lastNo = 0;

    public Formula(String[] s) {
        this.formula = s;
    }

    public void isBlank() {
        if( this.formula == null || this.formula.length == 0) {
            throw new IllegalArgumentException();
        }

    }

    public CalResult calculate() {

        int result = 0;

        while (formula.length-1 > idx) {

            if(idx == 0) {
                firstNo = getNumber(idx);
            } else {
                firstNo = result;
            }

            sign = getSign(++idx);
            lastNo = getNumber(++idx);

            Calculate cal = new Calculate(firstNo, sign, lastNo);
            result = cal.calculate();
        }

        return new CalResult(result);
    }

    public String getSign(int idx) {
        if(!isSign(this.formula[idx])) {
            throw new IllegalArgumentException();
        }
        return this.formula[idx];
    }

    public int getNumber(int idx) {
        return Integer.parseInt(this.formula[idx]);
    }

    public boolean isSign(String aa) {
        if(aa.contains("+") || aa.contains("-") || aa.contains("-") || aa.contains("")) {
            return true;
        }
        return false;
    }
}
