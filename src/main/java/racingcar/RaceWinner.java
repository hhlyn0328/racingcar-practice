package racingcar;

import java.util.List;
import java.util.stream.Collectors;

public class RaceWinner {

    private List<CarsResultPerTry> winnerList;

    public RaceWinner(List<CarsResultPerTry> winnerList) {
        this.winnerList = winnerList;
    }

    public List<String> raceWinner() {

        CarsResultPerTry carsResultLastTry = this.winnerList.get(this.winnerList.size() - 1);

        List<String> winnerList = carsResultLastTry.getCarResultList().stream()
                .filter(carResult -> carResult.isWinner(carsResultLastTry.maxAdvanceCount()))
                .map(carResult -> carResult.getCarName())
                .collect(Collectors.toList());

        return winnerList;
    }

}
