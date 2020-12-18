package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Race {

    public Cars readyCars(int carCount) {
        return new Cars(carCount);
    }

    public List<CarsResultPerTry> racing(Cars cars, int tryCount) {
        List<CarsResultPerTry> carsResultPerTryList = new ArrayList<>();

        for (int i = 0; i < tryCount; i++) {
            carsResultPerTryList.add(cars.carMove(cars));
        }

        return carsResultPerTryList;
    }

}
