package racingcar;

public class ResultView {
    private static final String CAR_STRING = "-";

    public static void result(int carCount, int tryCount) {
        System.out.println("실행결과");

        Cars cars = new Cars(carCount);

        for (int i = 0; i < tryCount; i++) {
            cars.carMove();
            getCar(cars);
            System.out.println();
        }
    }

    private static void getCar(Cars cars) {
        for (Car car : cars.getCars()) {
            printCarString(car);
        }
    }

    private static void printCarString(Car car) {
        for (int i = 0; i < car.getAdvanceCount(); i++) {
            System.out.print(CAR_STRING);
        }
        System.out.println();
    }
}
