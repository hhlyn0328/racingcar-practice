package racingcar;

public class CarResult {

    private String carName;
    private int advanceCount;

    public CarResult(String carName, int advanceCount) {
        this.carName = carName;
        this.advanceCount = advanceCount;
    }

    public String getCarName() {
        return carName;
    }

    public int getAdvanceCount() {
        return advanceCount;
    }

}
