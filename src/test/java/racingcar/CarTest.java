package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    private Car car = new Car();

    @Test
    @DisplayName("랜덤 숫자가 4이상일 경우 전진횟수 증가 테스트")
    void advanceMove() {
        this.car.move(5);
        assertThat(this.car.getAdvanceCount()).isEqualTo(1);
    }

    @Test
    @DisplayName("랜덤 숫자가 4이상일 경우 전진횟수 유지 테스트")
    void stopMove() {
        this.car.move(3);
        assertThat(this.car.getAdvanceCount()).isEqualTo(0);
    }
}
