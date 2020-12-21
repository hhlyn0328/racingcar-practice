package race;

public class RacingCarApplication {
    public static void main(String[] args) {

        String[] cars = InputView.inputCarCount();
        int raceCount = InputView.inputRaceCount();

        Race race = new Race(raceCount);
        race.startRace(cars);

        ResultView resultView = new ResultView();
        resultView.print(race.getRacingAllResult());
    }
}
