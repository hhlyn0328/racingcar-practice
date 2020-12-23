package race;

import java.util.ArrayList;
import java.util.List;

public class Race {

    private final int raceCount;
    private List<CarRacingResultsByRound> carRacingResultsByRounds = new ArrayList<>();
    private FinalRoundResult finalRoundResult;
    private RacingAllResult racingAllResult;


    public Race(int raceCount) {
        this.raceCount = raceCount;
    }

    public void startRace(String[] carNames) {
        Cars cars = new Cars(carNames);
        for(int i=0 ; i< this.raceCount; i++) {
            carRacingResultsByRounds.add(cars.move(cars));
        }
        finalRoundResult = new FinalRoundResult(carRacingResultsByRounds.get(carRacingResultsByRounds.size()-1));
        finalRoundResult.getWinners();

        racingAllResult = new RacingAllResult(carRacingResultsByRounds, finalRoundResult);
    }

    public RacingAllResult getRacingAllResult() {
        return racingAllResult;
    }
}
