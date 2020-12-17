package race;

import java.util.List;

public class ResultView {
    private final static String PRINT_TEXT = "-";

    public static void print(List<Cars> raceResult) {
        for(int i = 0; i< raceResult.size(); i++){
            System.out.println(i+1 + " 회");

            raceResult.get(i).getCars().forEach(car -> {
                printMove(car);
                System.out.println();
            });
            System.out.println();
        }
    }

    private static void printMove(Car car) {
        for(int i=0; i< car.getMove(); i++) {
            System.out.print(PRINT_TEXT);
        }

    }
}
