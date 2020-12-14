import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class CalculatorTest {

    @Test
    public void plus() {
        assertThat(Operator.PLUS.calculate(1, 2)).isEqualTo(3);
    }

    @Test
    public void minus() {
        assertThat(Operator.MINUS.calculate(1, 1)).isEqualTo(0);
    }

    @Test
    public void division() {
        assertThat(Operator.DIVISION.calculate(3, 3)).isEqualTo(1);
        assertThat(Operator.DIVISION.calculate(0, 1)).isEqualTo(0);
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
            Operator.DIVISION.calculate(1, 0);
        });

    }

    @Test
    public void multiply() {
        assertThat(Operator.MULTIPLY.calculate(3, 3)).isEqualTo(9);
    }

    @Test
    public void calculationEmptySymbol() {
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
            Calculator calculator = new Calculator();
            assertThat(calculator.calculation(1, "", 3)).isEqualTo(4);
        });
    }

    @Test
    public void calculation() {
        Calculator calculator = new Calculator();
        assertThat(calculator.calculation(1, "+", 3)).isEqualTo(4);
    }

    @Test
    void totalCalculation() {
        Calculator calculator = new Calculator();
        String input = "2 + 3 * 4 / 2 * 2";
        assertThat(calculator.totalCalculation(input)).isEqualTo(20);
    }
}
