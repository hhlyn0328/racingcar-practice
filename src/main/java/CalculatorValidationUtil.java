public class CalculatorValidationUtil {

    public Integer numberIsNotNull(Integer number) {
        if (number == null) {
            throw new IllegalArgumentException();
        }
        return number;
    }

    public String symbolValidation(String symbol) {
        if (!symbol.equals("+") && !symbol.equals("-") && !symbol.equals("/") && !symbol.equals("*")) {
            throw new IllegalArgumentException();
        }
        return symbol;
    }

}
