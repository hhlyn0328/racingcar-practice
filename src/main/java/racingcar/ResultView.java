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

    public static void printWinner(List<CarResult> carResultList) {
        int index = 0;
        for (CarResult carResult : carResultList) {
            System.out.print(carResult.getCarName());
            printComma(carResultList.size(), index);
            index++;
        }
        System.out.print("가 최종우승 하였습니다.");
    }

    private static void printComma(int carResultListSize, int index) {
        if (index < carResultListSize - 1) {
            System.out.print(", ");
        }
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
