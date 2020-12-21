package race;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class FinalRoundResult {

    private CarRacingResultsByRound finalRoundResult ;
    private List<CarRacingResult> winnerList = new ArrayList<>();

    public FinalRoundResult(CarRacingResultsByRound carRacingResultsByRound) {
        finalRoundResult = carRacingResultsByRound;

    }

    public void getWinnerCarNames() {
        OptionalInt maxMoveCountOptional  = this.finalRoundResult.getCarRacingResults().stream()
                .mapToInt(CarRacingResult::getMoveCount)
                .max();

        winnerList = this.finalRoundResult.getCarRacingResults().stream()
                .filter(carResult -> carResult.getMoveCount() == maxMoveCountOptional.orElse(0))
                .collect(Collectors.toList());

    }

    public List<CarRacingResult> getWinnerList() {
        return winnerList;
    }
}
