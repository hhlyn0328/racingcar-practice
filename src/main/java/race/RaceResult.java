package race;

import java.util.List;

public class RaceResult {
    private List<Cars> raceResult;


    public RaceResult(List<Cars> carsList) {
        raceResult = carsList;
    }

    public List<Cars> getRaceResult() {
        return this.raceResult;
    }
}
