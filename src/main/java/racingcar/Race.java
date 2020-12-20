package racingcar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    public int maxAdvanceCount(CarsResultPerTry carsResultPerTry) {

        Optional<CarResult> maxAdvanceCount = carsResultPerTry.getCarResultList().stream()
                .sorted(Comparator.comparing(CarResult::getAdvanceCount).reversed()).findFirst();

        return maxAdvanceCount.get().getAdvanceCount();
    }


    public List<CarResult> raceWinner(List<CarsResultPerTry> carsResultPerTryList) {

        CarsResultPerTry carsResultPerTry = carsResultPerTryList.get(carsResultPerTryList.size() - 1);

        List<CarResult> winnerList = carsResultPerTry.getCarResultList().stream()
                .filter(carResult -> carResult.getAdvanceCount() == maxAdvanceCount(carsResultPerTry))
                .collect(Collectors.toList());

        return winnerList;
    }
}
