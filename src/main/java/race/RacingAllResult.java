package race;

import java.util.List;

public class RacingAllResult {
    private final List<CarRacingResultsByRound> carRacingResultsByRound;
    private final FinalRoundResult finalRoundResult;

    public RacingAllResult(List<CarRacingResultsByRound> carRacingResultsByRounds, FinalRoundResult finalRoundResult) {
        this.carRacingResultsByRound = carRacingResultsByRounds;
        this.finalRoundResult = finalRoundResult;
    }

    public List<CarRacingResultsByRound> getCarRacingResultsByRound() {
        return carRacingResultsByRound;
    }

    public FinalRoundResult getFinalRoundResult() {
        return finalRoundResult;
    }
}
