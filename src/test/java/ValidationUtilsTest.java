
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ValidationUtilsTest {


    @Test
    void nullTest() {

        Formula formula = new Formula(null);
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
            formula.isBlank();
        });
    }


}
