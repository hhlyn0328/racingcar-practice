package race;



public class Car {
    private static final int LIMIT = 4;

    private String carName;
    private int moveCount;

    public Car(String carName) {
        this.carName = carName;
        this.moveCount = 0;
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
