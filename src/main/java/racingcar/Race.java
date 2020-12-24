package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Race {

    public Cars readyCars(String carNamesString) {
        return new Cars(carNamesString);
    }

    public List<CarsResultPerTry> racing(Cars cars, int tryCount) {
        List<CarsResultPerTry> racingResult = new ArrayList<>();

        for (int i = 0; i < tryCount; i++) {
            racingResult.add(cars.carMove(cars));
        }

        return racingResult;
    }

}
