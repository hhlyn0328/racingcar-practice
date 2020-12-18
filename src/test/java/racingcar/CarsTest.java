package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarsTest {

    private static final int CAR_COUNT = 3;

    private Cars cars = new Cars(CAR_COUNT);

    @Test
    @DisplayName("생성자로 자동차 생성숫자 만큼 생성되었는지 테스트")
    void constructorTest() {
        assertThat(this.cars.getCars().size()).isEqualTo(CAR_COUNT);
    }

}
