package race;



import javax.naming.SizeLimitExceededException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Cars {
    private List<Car> cars;
    private static final Random random = new Random();
    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 9;

    public List<Car> getCars() {
        return cars;
    }

    public Cars(String[] carNames) {
        cars = new ArrayList<>();
        cars = Arrays.stream(carNames)
                .map(carName -> new Car(carName))
                .collect(Collectors.toList());
    }

    public CarRacingResultsByRound move(Cars cars) {
        List<CarRacingResult> carRacingResults =
        cars.getCars().stream()
                .map(car -> car.move(this.randomNumber()))
                .collect(Collectors.toList());
        return new CarRacingResultsByRound(carRacingResults);
    }

    private int randomNumber() {
        int randomNumber = random.nextInt(MAX_NUMBER);
        if (!isValidRandomNumber(randomNumber)) {
            throw new IllegalArgumentException();
        }
        return randomNumber;
    }

    public boolean isValidRandomNumber(int random) {
        return random >= MIN_NUMBER && random <= MAX_NUMBER;
    }
}
