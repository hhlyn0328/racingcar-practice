package race;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Cars {
    private List<Car> cars;
    private final static int MAX_NUMBER = 10;
    private final static int MIN_NUMBER = 0;
    private final static Random random = new Random();

    public Cars(int carCount) {
        cars = new ArrayList<>();
        for(int i=0 ; i< carCount ; i++) {
            cars.add(new Car(0));
        }
    }

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return this.cars;
    }

    public CarsRacingResultByRound move(Cars cars) {
        List<CarRacingResult> carRacingResults =  cars.getCars().stream()
                .map(car -> car.move(this.randomNumber()))
                .collect(Collectors.toList());

        return new CarsRacingResultByRound(carRacingResults);
    }

    public int randomNumber() {
        int randomNumber = random.nextInt(9);
        if (!validateNumber(randomNumber)) {
            throw new IllegalArgumentException();
        }
        return randomNumber;
    }

    public boolean validateNumber(int number) {
        return  number >= MIN_NUMBER && number < MAX_NUMBER;
    }


}
