import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OperatorTest {

    @Test
    void valueOfSymbol() {
        assertThat(Operator.valueOfSymbol("+")).isEqualTo(Operator.PLUS);
        assertThat(Operator.valueOfSymbol("-")).isEqualTo(Operator.MINUS);
        assertThat(Operator.valueOfSymbol("/")).isEqualTo(Operator.DIVISION);
        assertThat(Operator.valueOfSymbol("*")).isEqualTo(Operator.MULTIPLY);
    }

}
