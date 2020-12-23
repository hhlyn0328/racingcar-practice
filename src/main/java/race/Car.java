package race;



public class Car {
    private static final int LIMIT = 4;

    private String carName;
    private int moveCount;
    private static final int CAR_NAME_LENGTH_LIMIT = 5;

    public Car(String carName) {
        this.checkCarNameLength(carName);
        this.carName = carName;
        this.moveCount = 0;
    }
    private void checkCarNameLength(String carName) {
        if(carName.length() > CAR_NAME_LENGTH_LIMIT) {
            throw new IllegalArgumentException();
        }
    }

    public CarRacingResult move(int number) {
        if(number >= LIMIT ) {
            this.moveCount += 1;
        }
        return new CarRacingResult(this.carName, this.moveCount);
    }

    public int getMoveCount() {
        return this.moveCount;
    }
    public String getCarName() {
        return carName;
    }


}
