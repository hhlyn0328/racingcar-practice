package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RaceTest {

    Race race = new Race();

    @Test
    @DisplayName("자동차 생성 테스트")
    void readyCars() {
        assertThat(this.race.readyCars(3).getCars().size()).isEqualTo(3);
    }

    @Test
    @DisplayName("3개의 자동차로 5번의 레이싱이 있었는지 테스트")
    void racing() {
        assertThat(this.race.racing(race.readyCars(3), 5).size()).
                isEqualTo(5);
    }
}
