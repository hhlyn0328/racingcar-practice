package race;

import java.util.Collections;
import java.util.List;

public class CarRacingResultsByRound {

    private  List<CarRacingResult> carRacingResults;

    public CarRacingResultsByRound(List<CarRacingResult> carRacingResults) {
        this.carRacingResults = Collections.unmodifiableList(carRacingResults);
    }

    public List<CarRacingResult> getCarRacingResults() {
        return carRacingResults;
    }
}
