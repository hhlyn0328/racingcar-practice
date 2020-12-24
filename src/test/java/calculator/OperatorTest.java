package calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class OperatorTest {

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
    void valueOfSymbol() {
        assertThat(Operator.valueOfSymbol("+")).isEqualTo(Operator.PLUS);
        assertThat(Operator.valueOfSymbol("-")).isEqualTo(Operator.MINUS);
        assertThat(Operator.valueOfSymbol("/")).isEqualTo(Operator.DIVISION);
        assertThat(Operator.valueOfSymbol("*")).isEqualTo(Operator.MULTIPLY);
    }

}
