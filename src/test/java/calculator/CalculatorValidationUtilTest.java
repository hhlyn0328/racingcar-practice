package calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class CalculatorValidationUtilTest {

    @Test
    void numberIsNotNull() {
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
            CalculatorValidationUtil.numberIsNotNull(null);
        });
    }

}
