package race;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class CarsTest {
    Cars cars;
    String[] carNames =  {"ss", "mm", "tu"};
    @BeforeEach
    void setUp() {
        cars = new Cars(carNames);
    }

    @Test
    void createCars() {
        Cars cars = new Cars(carNames);

        assertThat(cars.getCars().size()).isEqualTo(3);
    }

    @Test
    void isValidRandomNumberTest() {
        int random = 4;
        boolean isValid = cars.isValidRandomNumber(random);
        assertThat(isValid).isTrue();
    }

    @Test
    void isNotValidRandomNumberTest() {
        int random = 10 ;
        boolean isValid = cars.isValidRandomNumber(random);
        assertThat(isValid).isFalse();
    }

    @Test
    void isNotOverCarNameLength5Test() {
        String[] carNames =  {"sonata", "morning", "tusan"};
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
            new Cars(carNames);
        });
    }

}
