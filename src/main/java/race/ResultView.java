package race;


public class ResultView {
    private final static String PRINT_TEXT = "-";

    public static void print(RacingAllResult raceResults) {
        for(CarRacingResultsByRound carRacingResultsByRound : raceResults.getCarRacingResultsByRound()) {
            printCars(carRacingResultsByRound);
            System.out.println();
        }
        printWinners(raceResults.getFinalRoundResult());
    }

    private static void printWinners(FinalRoundResult finalRoundResult) {
        for(int i=0; i<finalRoundResult.getWinnerList().size(); i++) {
            System.out.print(finalRoundResult.getWinnerList().get(i).getCarName());
            if(i < finalRoundResult.getWinnerList().size()-1) {
                System.out.print(",");
            }
        }
        System.out.println(" 가 최종 우승했습니다. ");
    }

    private static void printCars(CarRacingResultsByRound carRacingResultsByRound) {
        for(CarRacingResult carRacingResult : carRacingResultsByRound.getCarRacingResults()) {
            printMove(carRacingResult);
        }
    }

    private static void printMove(CarRacingResult carRacingResult) {
        System.out.print(carRacingResult.getCarName() + " : ");
        for(int i = 0; i< carRacingResult.getMoveCount(); i++) {
            System.out.print(PRINT_TEXT);
        }
        System.out.println();
    }
}
