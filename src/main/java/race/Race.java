package race;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private int raceCount;
    private List<CarsRacingResultByRound> carsRacingResultByRounds = new ArrayList<>();

    public Race(int raceCount) {
        this.raceCount = raceCount;
    }

    public void startRace(int carCount) {
        Cars cars = new Cars(carCount);

        for(int i=0; i< this.raceCount; i++) {
            carsRacingResultByRounds.add(cars.move(cars));
        }
    }

    public List<CarsRacingResultByRound> getRaceResult() {
        return carsRacingResultByRounds;
    }

}
