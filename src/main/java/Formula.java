
public class Formula {
    private final String[] formula ;


    public Formula(String[] s) {
        this.formula = s;
    }

    public void isBlank() {
        if( this.formula == null || this.formula.length == 0) {
            throw new IllegalArgumentException();
        }
    }

    public CalResult calculate() {

        int firstNo = getNumber(0);

        for (int i = 1; i < formula.length; i += 2) {
            firstNo = Calculate.calculate(firstNo, getSign(i), getNumber(i+1));
        }

        return new CalResult(firstNo);
    }

    private String getSign(int idx) {
        if(!isSign(this.formula[idx])) {
            throw new IllegalArgumentException();
        }
        return this.formula[idx];
    }

    private int getNumber(int idx) {
        return Integer.parseInt(this.formula[idx]);
    }

    public boolean isSign(String aa) {
        if(aa.contains("+") || aa.contains("-") || aa.contains("-") || aa.contains("")) {
            return true;
        }
        return false;
    }

}
