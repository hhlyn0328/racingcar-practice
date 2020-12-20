package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class CarsResultPerTryTest {

    List<CarResult> carResultList = new ArrayList<>();
    CarsResultPerTry carsResultPerTry = new CarsResultPerTry(carResultList);

    @Test
    @DisplayName("생성자 생성할떄 unmodifiableList 정상동작 테스트 ")
    void constructorTest() {
        assertThat(carsResultPerTry.getCarResultList()).isEmpty();
        assertThatExceptionOfType(UnsupportedOperationException.class).isThrownBy(() -> {
            carsResultPerTry.getCarResultList().add(new CarResult("carName1", 0));
        });
    }
}
