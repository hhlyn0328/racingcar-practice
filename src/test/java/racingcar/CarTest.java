package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class CarTest {

    private Car car = new Car("car1",0);

    @Test
    @DisplayName("랜덤 숫자가 4이상일 경우 전진횟수 증가 테스트")
    void advanceMove() {
        assertThat(this.car.getAdvanceCount()).isEqualTo(0);

        CarResult carResult = this.car.move(5);
        assertThat(carResult.getAdvanceCount()).isEqualTo(1);
    }

    @Test
    @DisplayName("랜덤 숫자가 4미만일 경우 전진횟수 유지 테스트")
    void stopMove() {
        this.car.move(3);
        assertThat(this.car.getAdvanceCount()).isEqualTo(0);

        CarResult carResult = this.car.move(3);
        assertThat(carResult.getAdvanceCount()).isEqualTo(0);
    }

    @Test
    @DisplayName("랜덤 숫자가 0보다 작을경우 테스트")
    void randomMinNumberTest() {
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
            this.car.validateRandomNumber(-1);
        });
    }

    @Test
    @DisplayName("랜덤 숫자가 9보다 클 경우 테스트")
    void randomMaxNumberTest() {
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
            this.car.validateRandomNumber(10);
        });
    }

    @Test
    @DisplayName("자동차가 잘 생성되는지 테스트")
    void createCar() {
        assertThat(this.car.getCarName()).isEqualTo("car1");

    }
}
