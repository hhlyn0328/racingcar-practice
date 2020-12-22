package racingcar;

import java.util.List;

public class ResultView {
    private static final String CAR_STRING = "-";
    private static final String CAR_SEPARATOR = " ,";

    public static void printResult(List<CarsResultPerTry> carsResultPerTryList) {
        System.out.println("실행결과");
        for (CarsResultPerTry carsResultPerTry : carsResultPerTryList) {
            printCar(carsResultPerTry);
            System.out.println();
        }
    }

    public static void printWinner(List<String> winnerList) {
        System.out.print(String.join(CAR_SEPARATOR, winnerList) + "가 최종우승 하였습니다.");
    }

    private static void printCar(CarsResultPerTry carsResultPerTry) {
        for (CarResult carResult : carsResultPerTry.getCarResultList()) {
            printCarString(carResult);
        }
    }

    private static void printCarString(CarResult carResult) {
        System.out.print(carResult.getCarName() + " : ");
        for (int i = 0; i < carResult.getAdvanceCount(); i++) {
            System.out.print(CAR_STRING);
        }
        System.out.println();
    }
}
