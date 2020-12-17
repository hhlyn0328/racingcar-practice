package race;


public class RacingCarApplication {
    public static void main(String[] args) {

        InputView inputView = new InputView();
        int carCount = inputView.inputCarCount();
        int raceCount = inputView.inputRaceCount();

        Cars cars = new Cars(carCount);
        Race race = new Race(raceCount);
        race.startRace(cars.getCars());

        ResultView resultView = new ResultView();
        resultView.print(race.getRaceResult());
    }
}
