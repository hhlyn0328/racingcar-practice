package racingcar;

public class Car {

    private static final int RANDOM_MIN_VALUE = 0;
    private static final int RANDOM_MAX_VALUE = 9;

    private static final int ADVANCE_STANDARD_NUMBER = 4;

    private static final int CAR_NAME_LIMIT = 5;

    private String carName;
    private int advanceCount;

    public Car(String carName, int advanceCount) {
        if (CAR_NAME_LIMIT < carName.length()) {
            throw new IllegalArgumentException();
        }

        this.carName = carName;
        this.advanceCount = advanceCount;
    }

    public String getCarName() {
        return carName;
    }

    public int getAdvanceCount() {
        return advanceCount;
    }

    public CarResult move(int randomNumber) {

        validateRandomNumber(randomNumber);

        if (isAdvanceNumber(randomNumber)) {
            this.advanceCount++;
        }

        return new CarResult(this.carName, this.advanceCount);
    }

    public void validateRandomNumber(int randomNumber) {
        if (RANDOM_MIN_VALUE > randomNumber || RANDOM_MAX_VALUE < randomNumber) {
            throw new IllegalArgumentException();
        }
    }

    private boolean isAdvanceNumber(int randomNumber) {
        return ADVANCE_STANDARD_NUMBER <= randomNumber;
    }
}
