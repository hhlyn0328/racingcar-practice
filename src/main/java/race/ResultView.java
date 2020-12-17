package race;

public class ResultView {
    private final static String PRINT_TEXT = "-";

    public static void print(RaceResult raceResult) {
        for(int i = 0; i< raceResult.getRaceResult().size(); i++){
            System.out.println(i+1 + " 회");
            printCars(raceResult.getRaceResult().get(i));
            System.out.println();
        }
    }

    private static void printCars(Cars cars) {
        cars.getCars().forEach(car -> {
            printMove(car);
            System.out.println();
        });
    }

    private static void printMove(Car car) {
        for(int i=0; i< car.getMove(); i++) {
            System.out.print(PRINT_TEXT);
        }

    }
}
