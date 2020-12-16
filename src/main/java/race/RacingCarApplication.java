package race;


public class RacingCarApplication {
    public static void main(String[] args) {

        InputView inputView = new InputView();
        int carCount = inputView.inputCarCount();
        int raceCount = inputView.inputRaceCount();

        RaceResult raceResult = new RaceResult(carCount, raceCount);
        raceResult.startRace();
        ResultView resultView = new ResultView(raceResult.getRaceResult());
        resultView.print();


    }
}
