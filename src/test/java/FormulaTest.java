
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class FormulaTest {


    @Test
    void nullTest() {

        Formula formula = new Formula(null);
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
            formula.isBlank();
        });
    }

    @Test
    void formulaTest() {
        String[] string = {"2","+","3","*","4","/","2"};
        Formula formula = new Formula(string);

        CalResult result = formula.calculate();
        assertThat(result.getResult()).isEqualTo(10);
    }

    @Test
    void notAllowZeroTest() {
        String[] string = {"2","+","3","*","4","/","0"};
        Formula formula = new Formula(string);

        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
            formula.calculate();
        });
    }

    @Test
    void notAllowSignTest() {
        String[] string = {"2","^","3","*","4","/","0"};
        Formula formula = new Formula(string);

        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
            formula.calculate();
        });
    }


}
