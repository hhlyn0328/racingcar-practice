package race;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Race {

    private int tryCount;
    private List<Car> cars;
    private static int MAX_NUMBER = 10;
    private static int MIN_NUMBER = 0;


    public boolean validateNumber(int number) {
        return MIN_NUMBER >= 0 && MAX_NUMBER < 10;
    }

    public boolean isMove(int number) {
        if(number >= 4) {
            return true;
        }
        return false;
    }

    public int randomNumber() {
        Random randomNumber = new Random();
        return randomNumber.nextInt(9);
    }

    public void race(int tryCount, List<Car> cars) {
        this.tryCount = tryCount;

        this.cars = cars.stream()
                .map(car -> {
                    car.move(this.randomNumber());
                    return new Car(car.getMove());
                }).collect(Collectors.toList());

    }

    public List<Car> getCars() {
        return cars;
    }

    public int getTryCount() {
        return this.tryCount;
    }
}
