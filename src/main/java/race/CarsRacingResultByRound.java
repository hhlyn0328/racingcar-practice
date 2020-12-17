package race;

import java.util.List;

public class CarsRacingResultByRound {
    private List<CarRacingResult> carRacingResults;

    public CarsRacingResultByRound(List<CarRacingResult> carRacingResults) {
        this.carRacingResults = carRacingResults;
    }

    public List<CarRacingResult> getCarRacingResults() {
        return carRacingResults;
    }
}
