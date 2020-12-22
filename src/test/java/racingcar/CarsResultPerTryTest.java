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
    private static final String CAR_SEPARATOR = ",";


    @Test
    @DisplayName("생성자 생성할떄 unmodifiableList 정상동작 테스트 ")
    void constructorTest() {
        assertThat(this.carsResultPerTry.getCarResultList()).isEmpty();
        assertThatExceptionOfType(UnsupportedOperationException.class).isThrownBy(() -> {
            this.carsResultPerTry.getCarResultList().add(new CarResult("carName1", 0));
        });
    }

    @Test
    @DisplayName("레이스의 최대 advanceCount 조회 테스트")
    void maxAdvanceCount() {
        List<CarResult> carResultList = new ArrayList<>();
        carResultList.add(new CarResult("pobi", 1));
        carResultList.add(new CarResult("crong", 2));
        carResultList.add(new CarResult("honux", 3));
        assertThat(this.carsResultPerTry.maxAdvanceCount(new CarsResultPerTry(carResultList))).isEqualTo(3);
    }

    @Test
    @DisplayName("레이스의 승자 조회 테스트")
    void raceWinnerTest() {
        List<CarResult> carResultList = new ArrayList<>();
        carResultList.add(new CarResult("pobi", 1));
        carResultList.add(new CarResult("crong", 2));
        carResultList.add(new CarResult("honux", 3));
        List<CarsResultPerTry> racingResult = new ArrayList<>();
        racingResult.add(new CarsResultPerTry(carResultList));
        assertThat(String.join(CAR_SEPARATOR, this.carsResultPerTry.raceWinner(racingResult))).isEqualTo("honux");
    }
}
