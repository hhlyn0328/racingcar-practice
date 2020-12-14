import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculateTest {

    @Test
    void plusTest() {
        int result = Calculator.calculate(1, "+", 2);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void minusTest() {
        int result = Calculator.calculate(3, "-", 2);
        assertThat(result).isEqualTo(1);

    }
    @Test
    void multipleTest() {
        int result = Calculator.calculate(3, "*", 2);
        assertThat(result).isEqualTo(6);

    }
    @Test
    void divideTest() {
        int result = Calculator.calculate(4, "/", 2);
        assertThat(result).isEqualTo(2);

    }
}
