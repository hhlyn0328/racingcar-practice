package race;

public class CarRacingResult {

    private String carName;
    private int moveCount;

    public CarRacingResult(String carName, int moveCount) {
        this.carName = carName;
        this.moveCount = moveCount;
    }

    public String getCarName() {
        return carName;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public boolean isWinner(int maxMoveCount) {
        return this.moveCount == maxMoveCount;
    }

}
