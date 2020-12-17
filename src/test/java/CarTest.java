import org.junit.jupiter.api.Test;
import race.Car;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @Test
    void moveGreaterThan4Test() {
        //4이상이면 전진하다
        Car car = new Car(0);
        car.move(5);

        assertThat(car.getMove()).isEqualTo(1);
    }

    @Test
    void notMoveLessThan4Test() {
        //4미만이면 전진하지 않는다
        Car car = new Car(0);
        car.move(3);

        assertThat(car.getMove()).isNotEqualTo(1);
    }
}
