package racingcar;

import java.util.List;
import java.util.stream.Collectors;

public class RaceWinner {

    private List<CarsResultPerTry> carsResults;

    public RaceWinner(List<CarsResultPerTry> carsResults) {
        this.carsResults = carsResults;
    }

    public List<String> raceWinner() {

        CarsResultPerTry carsResultLastTry = this.carsResults.get(this.carsResults.size() - 1);
        int maxAdvanceCount = carsResultLastTry.maxAdvanceCount();

        List<String> winnerList = carsResultLastTry.getCarResultList().stream()
                .filter(carResult -> carResult.isWinner(maxAdvanceCount))
                .map(CarResult::getCarName)
                .collect(Collectors.toList());

        return winnerList;
    }

}
