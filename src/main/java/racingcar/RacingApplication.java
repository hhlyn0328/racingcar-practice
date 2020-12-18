package racingcar;

import java.util.List;

public class RacingApplication {

    public static void main(String[] args) {
        int carCount = InputView.scannerCarCount();
        int tryCount = InputView.scannerTryCount();

        Race race = new Race();
        Cars cars = race.readyCars(carCount);
        List<CarsResultPerTry> carsResultPerTryList = race.racing(cars, tryCount);
        ResultView.printResult(carsResultPerTryList);
    }

}
