package race;


import java.util.Scanner;

public class RacingCarApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        InputView inputView = new InputView();
        int carCount = inputView.inputCarCount(scanner);
        int raceCount = inputView.inputRaceCount(scanner);

        Race race = new Race(raceCount);
        race.startRace(carCount);

        ResultView resultView = new ResultView();
        resultView.print(race.getRaceResult());
    }
}
