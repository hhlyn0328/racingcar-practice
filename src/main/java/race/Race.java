package race;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private int raceCount;
    private List<Cars> carsList = new ArrayList<>();

    public Race(int raceCount) {
        this.raceCount = raceCount;
    }

    public void startRace(List<Car> cars) {

        Cars newCars = new Cars(cars);
        for(int i=0; i< this.raceCount; i++) {
            carsList.add(new Cars(race(newCars)));
        }
    }

    public List<Car> race(Cars cars) {
        return cars.move(cars);
    }

    public List<Cars> getRaceResult() {
        return this.carsList;
    }

}
