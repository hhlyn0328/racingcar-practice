package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cars {

    private static final Random RANDOM = new Random();
    private static final int RANDOM_LIMIT_NUMBER = 10;

    private List<Car> cars = new ArrayList<>();

    public Cars(int carCount) {
        for (int i = 0; i < carCount; i++) {
            this.cars.add(new Car());
        }
    }

    public void carMove() {
        for (int i = 0; i < this.cars.size(); i++) {
            this.cars.get(i).move(randomNumber0To9());
        }
    }

    public List<Car> getCars() {
        return cars;
    }

    // 테스트 코드에서 사용하기위해 protected 로 선언
    protected int randomNumber0To9() {
        return RANDOM.nextInt(RANDOM_LIMIT_NUMBER);
    }
}
