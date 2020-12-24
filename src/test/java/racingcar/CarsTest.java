package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarsTest {

    private static final String CAR_NAMES = "carName1,carName2,carName3";
    private static final int CAR_NAMES_SIZE = 3;

    private Cars cars = new Cars(CAR_NAMES);

    @Test
    @DisplayName("생성자로 자동차 생성숫자 만큼 생성되었는지 테스트")
    void constructorTest() {
        assertThat(this.cars.getCars().size()).isEqualTo(CAR_NAMES_SIZE);
    }

}
