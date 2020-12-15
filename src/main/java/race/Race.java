package race;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Race {

    private int tryCount;
    private List<Car> cars;


    public boolean validateNumber(int number) {
        if(number >= 0 && number < 10) {
            return true;
        }
        return false;
    }

    public boolean isMove(int number) {
        if(number >= 4) {
            return true;
        }
        return false;
    }

    public int generateNumber() {
        Random randomNumber = new Random();
        return randomNumber.nextInt(9);
    }

    public void race(int tryCount, List<Car> cars) {
        this.tryCount = tryCount;

        this.cars = cars.stream()
                .map(car -> {
                    if(isMove(this.generateNumber())) {
                        car.addMove();
                    }
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
