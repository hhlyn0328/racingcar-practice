package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Cars {

    private static final Random RANDOM = new Random();
    private static final int RANDOM_LIMIT_NUMBER = 10;

    private List<Car> cars = new ArrayList<>();

    public Cars(String carNamesString) {
        String[] carNames = carNamesString.split(",");
        for (int i = 0; i < carNames.length; i++) {
            this.cars.add(new Car(carNames[i], 0));
        }
    }

    public CarsResultPerTry carMove(Cars cars) {

        List<CarResult> carResultList = cars.getCars().stream()
                .map(car -> car.move(randomNumber0To9()))
                .collect(Collectors.toList());

        return new CarsResultPerTry(carResultList);
    }

    public List<Car> getCars() {
        return cars;
    }

    // 테스트 코드에서 사용하기위해 protected 로 선언
    protected int randomNumber0To9() {
        return RANDOM.nextInt(RANDOM_LIMIT_NUMBER);
    }
}
