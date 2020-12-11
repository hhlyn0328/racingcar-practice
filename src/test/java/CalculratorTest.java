import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class CalculratorTest {

    @Test
    public void plus() {
        assertThat(Calculrator.plus(1, 2)).isEqualTo(3);
    }

    @Test
    public void minus() {
        assertThat(Calculrator.minus(1, 1)).isEqualTo(0);
    }

    @Test
    public void division() {
        assertThat(Calculrator.division(3, 3)).isEqualTo(1);
    }

    @Test
    public void multiply() {
        assertThat(Calculrator.multiply(3, 3)).isEqualTo(9);
    }

    @Test
    public void numberNullTest() {
        Calculrator calculrator = new Calculrator();
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
            calculrator.numberIsNotNull(null);
        });
    }

    @Test
    public void symbolValidationTest() {
        Calculrator calculrator = new Calculrator();
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
            calculrator.symbolValidation("=");
        });
    }

    @Test
    public void numbers() {
        Calculrator calculrator = new Calculrator();
        String input = "2 + 3 * 4 / 2";
        assertThat(calculrator.getNumbers(input)).isEqualTo(Arrays.asList(2, 3, 4, 2));
    }

    @Test
    public void symbols() {
        Calculrator calculrator = new Calculrator();
        String input = "2 + 3 * 4 / 2";
        assertThat(calculrator.getSymbols(input)).isEqualTo(Arrays.asList("+", "*", "/"));
    }

    @Test
    public void calculration() {
        Calculrator calculrator = new Calculrator();
        assertThat(calculrator.calculration(1, "+", 3)).isEqualTo(4);
    }

    @Test
    void totalCalculration() {
        Calculrator calculrator = new Calculrator();
        String input = "2 + 3 * 4 / 2 * 2";
        assertThat(calculrator.totalCalculration(input)).isEqualTo(20);
    }
}
