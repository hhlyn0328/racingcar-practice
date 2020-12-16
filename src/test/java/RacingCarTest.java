import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import race.Car;
import race.Race;


import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarTest {
    Race race;
    @BeforeEach
    void setup() {
        race = new Race();
    }

    @Test
    void validateNumberTest() {
        //0~9사이의 랜덤 수 생성
        int randomNumber = race.randomNumber();
        //0~9사이의 수가 아니면 에러
        boolean validNumber = race.validateNumber(randomNumber);

        assertThat(validNumber).isTrue();
    }

    @Test
    void car2RaceTest() {
        List<Car> cars = Arrays.asList(new Car(0),new Car(0));
        race.race(1, cars);

        assertThat(race.getCars().size()).isEqualTo(2);
    }







}
