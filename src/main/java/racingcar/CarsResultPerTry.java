package racingcar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarsResultPerTry {

    private List<CarResult> carResultList;

    public CarsResultPerTry() {
    }

    public CarsResultPerTry(List<CarResult> carResultList) {
        this.carResultList = Collections.unmodifiableList(carResultList);
    }

    public List<CarResult> getCarResultList() {
        return carResultList;
    }

    public int maxAdvanceCount(CarsResultPerTry carsResultPerTry) {

        return carsResultPerTry.getCarResultList().stream()
                .mapToInt(CarResult::getAdvanceCount).max().getAsInt();

    }

    public List<String> raceWinner(List<CarsResultPerTry> carsResultPerTryList) {

        CarsResultPerTry carsResultPerTry = carsResultPerTryList.get(carsResultPerTryList.size() - 1);

        List<String> winnerList = new ArrayList<>();

        carsResultPerTry.getCarResultList().stream()
                .filter(carResult -> carResult.getAdvanceCount() == maxAdvanceCount(carsResultPerTry))
                .forEach(carResult -> winnerList.add(carResult.getCarName()));

        return winnerList;
    }

}
