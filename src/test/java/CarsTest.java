
import org.junit.jupiter.api.Test;
import race.Car;
import race.Cars;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @Test
    void validateNumberTest() {
        Cars car = new Cars(Arrays.asList(new Car(0)));
        //0~9사이의 랜덤 수 생성
        int randomNumber = car.randomNumber();
        //0~9사이의 수가 아니면 에러
        boolean validNumber = car.validateNumber(randomNumber);

        assertThat(validNumber).isTrue();
    }

    @Test
    void createCarsTest() {
        int carCount = 3;
        Cars cars = new Cars(carCount);
        assertThat(cars.getCars().size()).isEqualTo(3);
    }

}
