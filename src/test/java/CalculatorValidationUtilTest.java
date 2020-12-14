import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class CalculatorValidationUtilTest {

    @Test
    void numberIsNotNull() {
        CalculatorValidationUtil calculatorValidationUtil = new CalculatorValidationUtil();
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
            calculatorValidationUtil.numberIsNotNull(null);
        });
    }

    @Test
    void symbolValidation() {
        CalculatorValidationUtil calculatorValidationUtil = new CalculatorValidationUtil();
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
            calculatorValidationUtil.symbolValidation("=");
        });
    }

}
