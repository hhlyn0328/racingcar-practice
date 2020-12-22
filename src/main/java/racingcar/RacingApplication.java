package racingcar;

import java.util.List;

public class RacingApplication {

    public static void main(String[] args) {
        String carNamesString = InputView.scannerCarNames();
        int tryCount = InputView.scannerTryCount();

        Race race = new Race();
        Cars cars = race.readyCars(carNamesString);
        List<CarsResultPerTry> carsResultPerTryList = race.racing(cars, tryCount);
        ResultView.printResult(carsResultPerTryList);

        CarsResultPerTry carsResultPerTry = new CarsResultPerTry();
        ResultView.printWinner(carsResultPerTry.raceWinner(carsResultPerTryList));

    }

}
