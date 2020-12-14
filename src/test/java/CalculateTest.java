import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculateTest {

    @Test
    void plusTest() {
        int result = Calculate.calculate(1, "+", 2);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void minusTest() {
        int result = Calculate.calculate(3, "-", 2);
        assertThat(result).isEqualTo(1);

    }
    @Test
    void multipleTest() {
        int result = Calculate.calculate(3, "*", 2);
        assertThat(result).isEqualTo(6);

    }
    @Test
    void divideTest() {
        int result = Calculate.calculate(4, "/", 2);
        assertThat(result).isEqualTo(2);

    }

    @Test
    void divideZeroTest() {
        int result = Calculate.calculate(4, "/", 2);
    }




}
