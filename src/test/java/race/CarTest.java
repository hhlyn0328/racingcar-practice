package race;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    private Car car;
    @BeforeEach
    void setUp() {
        car = new Car("sonata");
    }

    @Test
    void moveTest() {
        car.move(5);
        assertThat(car.getMoveCount()).isEqualTo(1);
    }

    @Test
    void notMoveTest() {
        car.move(3);
        assertThat(car.getMoveCount()).isNotEqualTo(1);
    }



}
