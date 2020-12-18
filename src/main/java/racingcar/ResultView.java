package racingcar;

import java.util.List;

public class ResultView {
    private static final String CAR_STRING = "-";

    public static void printResult(List<CarsResultPerTry> carsResultPerTryList) {
        System.out.println("실행결과");
        for (CarsResultPerTry carsResultPerTry : carsResultPerTryList) {
            printCar(carsResultPerTry);
            System.out.println();
        }
    }

    private static void printCar(CarsResultPerTry carsResultPerTry) {
        for (CarResult carResult : carsResultPerTry.getCarResultList()) {
            printCarString(carResult);
        }
    }

    private static void printCarString(CarResult carResult) {
        for (int i = 0; i < carResult.getAdvanceCount(); i++) {
            System.out.print(CAR_STRING);
        }
        System.out.println();
    }
}
