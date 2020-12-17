package race;


import java.util.Scanner;

public class RacingCarApplication {
    public static void main(String[] args) {

        InputView inputView = new InputView();
        int carCount = inputView.inputCarCount();
        int raceCount = inputView.inputRaceCount();

        Race race = new Race(raceCount);
        race.startRace(carCount);

        ResultView resultView = new ResultView();
        resultView.print(race.getRaceResult());
    }
}
