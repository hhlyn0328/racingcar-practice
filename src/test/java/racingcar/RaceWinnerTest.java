package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RaceWinnerTest {

    List<CarResult> carResultList = new ArrayList<>();
    private static final String CAR_SEPARATOR = ",";

    @Test
    @DisplayName("레이스의 최대 advanceCount 조회 테스트")
    void maxAdvanceCount() {
        List<CarResult> carResultList = new ArrayList<>();
        carResultList.add(new CarResult("pobi", 0));
        carResultList.add(new CarResult("crong", 0));
        carResultList.add(new CarResult("honux", 3));
        CarsResultPerTry carsResultPerTry = new CarsResultPerTry(carResultList);
        assertThat(carsResultPerTry.maxAdvanceCount()).isEqualTo(3);
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
        assertThat(String.join(CAR_SEPARATOR, new RaceWinner(racingResult).raceWinner())).isEqualTo("honux");
    }

}
