package racingcar;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarTest {

    @Test
    void randomTest() {
        Random rand = new Random();
        assertThat(rand.nextInt(10)).isBetween(0, 9);
    }

    @Test
    void moveAdvanceTest() {
        Car car = new Car();
        car.move(4);
        assertThat(car.getAdvanceCount()).isEqualTo(1);
    }

    @Test
    void moveStopTest() {
        Car car = new Car();
        car.move(3);
        assertThat(car.getAdvanceCount()).isEqualTo(0);
    }

}
