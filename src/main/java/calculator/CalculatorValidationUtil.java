package calculator;

public class CalculatorValidationUtil {

    private CalculatorValidationUtil() {
    }

    public static Integer numberIsNotNull(Integer number) {
        if (number == null) {
            throw new IllegalArgumentException();
        }
        return number;
    }

}
