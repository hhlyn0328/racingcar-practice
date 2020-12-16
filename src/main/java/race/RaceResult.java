package race;

import java.util.ArrayList;
import java.util.List;

public class RaceResult {

    private final int carCount;
    private final int raceCount;

    private List<Race> raceResult;

    public RaceResult(int carCount, int raceCount) {
        this.carCount = carCount;
        this.raceCount = raceCount;
    }

    public void startRace() {
        List<Race> races = new ArrayList<>();
        List<Car> cars = new ArrayList<>();
        for(int i=0; i< this.carCount; i++) {
            cars.add(new Car(0));
        }
        for(int i=0; i< this.raceCount; i++) {
            Race race = new Race();
            race.race(cars);
            races.add(race);
        }
        this.raceResult = races;
    }

    public List<Race> getRaceResult() {
        return raceResult;
    }

}
