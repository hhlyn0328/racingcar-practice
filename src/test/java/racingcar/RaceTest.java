package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RaceTest {

    private static final String INPUT_CAR_NAMES = "pobi,crong,honux";

    Race race = new Race();

    @Test
    @DisplayName("자동차 생성 테스트")
    void readyCars() {
        assertThat(this.race.readyCars(INPUT_CAR_NAMES).getCars().size()).isEqualTo(3);
        assertThat(this.race.readyCars(INPUT_CAR_NAMES).getCars().get(0).getCarName()).isEqualTo("pobi");
        assertThat(this.race.readyCars(INPUT_CAR_NAMES).getCars().get(1).getCarName()).isEqualTo("crong");
        assertThat(this.race.readyCars(INPUT_CAR_NAMES).getCars().get(2).getCarName()).isEqualTo("honux");
    }

    @Test
    @DisplayName("3개의 자동차로 5번의 레이싱이 있었는지 테스트")
    void racing() {
        Cars cars = race.readyCars(INPUT_CAR_NAMES);
        assertThat(this.race.racing(cars, 5).size()).isEqualTo(5);
    }

    @Test
    @DisplayName("레이스의 최대 advanceCount 조회 테스트")
    void maxAdvanceCount() {
        List<CarResult> carResultList = new ArrayList<>();
        carResultList.add(new CarResult("pobi", 1));
        carResultList.add(new CarResult("crong", 2));
        carResultList.add(new CarResult("honux", 3));
        assertThat(this.race.maxAdvanceCount(new CarsResultPerTry(carResultList))).isEqualTo(3);
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
        assertThat(this.race.raceWinner(racingResult).get(0).getCarName()).isEqualTo("honux");
        assertThat(this.race.raceWinner(racingResult).get(0).getAdvanceCount()).isEqualTo(3);
    }
}
