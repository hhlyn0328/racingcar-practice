package race;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FinalRoundResult {

    private CarRacingResultsByRound finalRoundResult ;
    private List<CarRacingResult> winnerList = new ArrayList<>();


    public FinalRoundResult(CarRacingResultsByRound carRacingResultsByRound) {
        finalRoundResult = carRacingResultsByRound;

    }

    public void getWinners() {
        int maxMoveCount  = this.finalRoundResult.getCarRacingResults().stream()
                .mapToInt(CarRacingResult::getMoveCount)
                .max().orElse(0);

        winnerList = this.finalRoundResult.getCarRacingResults().stream()
                .filter(carResult -> carResult.isWinner(maxMoveCount) )
                .collect(Collectors.toList());

    }

    public List<String> getWinnerNames() {
        return winnerList.stream()
                .map(CarRacingResult::getCarName)
                .collect(Collectors.toList());
    }
}
