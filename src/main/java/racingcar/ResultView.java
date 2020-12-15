package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ResultView {
    private static final String CAR_STRING = "-";

    public void result(int carCount, int tryCount) {
        System.out.println("실행결과");

        List<Car> cars = initCars(carCount);

        for (int i = 0; i < tryCount; i++) {
            carMove(cars);
            System.out.println();
        }
    }

    private void carMove(List<Car> cars) {
        for (Car car : cars) {
            car.move(new Random().nextInt(10));
            printCarString(car);
        }
    }

    private void printCarString(Car car) {
        for (int i = 0; i < car.getAdvanceCount(); i++) {
            System.out.print(CAR_STRING);
        }
        System.out.println();
    }

    private List<Car> initCars(int carCount) {
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < carCount; i++) {
            cars.add(new Car());
        }

        return cars;
    }
}
