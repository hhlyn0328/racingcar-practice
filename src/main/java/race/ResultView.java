package race;

import java.util.List;

public class ResultView {
    private final static String PRINT_TEXT = "-";

    public static void print(List<CarsRacingResultByRound> raceResults) {
        for(CarsRacingResultByRound carsRacingResultByRound : raceResults) {
            printCars(carsRacingResultByRound);
            System.out.println();
        }
    }

    private static void printCars(CarsRacingResultByRound carsRacingResultByRound) {
        for(CarRacingResult carRacingResult : carsRacingResultByRound.getCarRacingResults()) {
            printMove(carRacingResult);
        }
    }

    private static void printMove(CarRacingResult carRacingResult) {
        for(int i = 0; i< carRacingResult.getMoveCount(); i++) {
            System.out.print(PRINT_TEXT);
        }
        System.out.println();
    }
}
