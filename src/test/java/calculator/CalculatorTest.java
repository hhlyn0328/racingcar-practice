package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class CalculatorTest {
    private static final int PREVIOUS_VALUE = 20;
    private static final int NEXT_VALUE = 10;
    private Calculator calculator;

    @BeforeEach
    public void init() {
        calculator = new Calculator();
    }

    @Test
    public void 더하기_테스트() {
        Symbol symbol = calculator.toEnum("+");
        assertThat(symbol.calculate(PREVIOUS_VALUE , NEXT_VALUE)).isEqualTo(30);
    }

    @Test
    public void 빼기_테스트() {
        Symbol symbol = calculator.toEnum("-");
        assertThat(symbol.calculate(PREVIOUS_VALUE , NEXT_VALUE)).isEqualTo(10);
    }

    @Test
    public void 곱하기_테스트() {
        Symbol symbol = calculator.toEnum("*");
        assertThat(symbol.calculate(PREVIOUS_VALUE , NEXT_VALUE)).isEqualTo(200);
    }

    @Test
    public void 나누기_테스트() {
        Symbol symbol = calculator.toEnum("/");
        assertThat(symbol.calculate(PREVIOUS_VALUE , NEXT_VALUE)).isEqualTo(2);
    }
}
