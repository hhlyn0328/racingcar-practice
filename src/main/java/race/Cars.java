package race;



import javax.naming.SizeLimitExceededException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Cars {
    private List<Car> cars;
    private static final Random random = new Random();
    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 9;
    private static final int CAR_NAME_LENGTH_LIMIT = 5;

    public List<Car> getCars() {
        return cars;
    }

    public Cars(String[] carNames) {
        cars = new ArrayList<>();
        for(int i=0; i< carNames.length; i++) {
            this.checkCarNameLength(carNames[i]);
            cars.add(new Car(carNames[i]));
        }
    }

    private void checkCarNameLength(String carName) {
        if(carName.length() > CAR_NAME_LENGTH_LIMIT) {
            throw new IllegalArgumentException();
        }
    }

    public CarRacingResultsByRound move(Cars cars) {
        List<CarRacingResult> carRacingResults =
        cars.getCars().stream()
                .map(car -> car.move(this.randomNumber()))
                .collect(Collectors.toList());
        return new CarRacingResultsByRound(carRacingResults);
    }

    private int randomNumber() {
        int randomNumber = random.nextInt(9);
        if (!isValidRandomNumber(randomNumber)) {
            throw new IllegalArgumentException();
        }
        return randomNumber;
    }

    public boolean isValidRandomNumber(int random) {
        return random >= MIN_NUMBER && random <= MAX_NUMBER;
    }
}
