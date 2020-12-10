import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculateTest {

    @Test
    void plusTest() {
        Calculate cal = new Calculate(1, "+", 2);
        int result = cal.calculate();
        assertThat(result).isEqualTo(3);
    }

    @Test
    void minusTest() {
        Calculate cal = new Calculate(3, "-", 2);
        int result = cal.calculate();
        assertThat(result).isEqualTo(1);

    }
    @Test
    void multipleTest() {
        Calculate cal = new Calculate(3, "*", 2);
        int result = cal.calculate();
        assertThat(result).isEqualTo(6);

    }
    @Test
    void divisionTest() {
        Calculate cal = new Calculate(4, "/", 2);
        int result = cal.calculate();
        assertThat(result).isEqualTo(2);

    }

    @Test
    void formulaTest() {
        String[] string = {"2","+","3","*","4","/","2"};
        Formula formula = new Formula(string);

        CalResult result = formula.calculate();
        assertThat(result.getResult()).isEqualTo(10);

    }

}
