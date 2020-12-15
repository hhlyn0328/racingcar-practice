package racingcar;

public class Car {

    private static final int ADVANCE_STANDARD_NUMBER = 4;

    private int advanceCount;

    public int getAdvanceCount() {
        return advanceCount;
    }

    public void move(int randomNumber) {
        if (isAdvanceNumber(randomNumber)) {
            advanceCount++;
        }
    }

    private boolean isAdvanceNumber(int randomNumber) {
        return ADVANCE_STANDARD_NUMBER <= randomNumber;
    }
}
