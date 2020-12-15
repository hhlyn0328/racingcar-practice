package race;

public class Car {
    private int moveCount;

    public Car(int move) {
        this.moveCount = move;
    }


    public void addMove() {
        this.moveCount += 1;
    }

    public int getMove() {
        return this.moveCount;
    }
}
