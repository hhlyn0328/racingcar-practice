import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import race.Car;
import race.Race;


import static org.assertj.core.api.Assertions.assertThat;

public class RacingTest {
    Race race;
    @BeforeEach
    void setup() {
        race = new Race();
    }

    @Test
    void validateNumberTest() {
        //0~9사이의 랜덤 수 생성
        int randomNumber = race.generateNumber();
        //0~9사이의 수가 아니면 에러
        boolean validNumber = race.validateNumber(randomNumber);

        assertThat(validNumber).isTrue();
    }

    @Test
    void moveGreaterThan4Test() {
        //4이상이면 전진하다
        boolean move = race.isMove(5);

        Car car = new Car(1);
        if(move) {
            car.addMove();
        }
        assertThat(car.getMove()).isEqualTo(1);
    }


}
