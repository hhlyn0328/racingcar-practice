package race;


public class RacingCarApplication {
    public static void main(String[] args) {

        int carCount = InputView.inputCarCount();
        int raceCount = InputView.inputRaceCount();

        Race race = new Race(raceCount);
        race.startRace(carCount);

        ResultView resultView = new ResultView();
        resultView.print(race.getRaceResult());
    }
}
