package race;

public class Car {
    private int moveCount;

    public Car(int move) {
        this.moveCount = move;
    }

    public int getMove() {
        return this.moveCount;
    }

    public void move(int number) {
        if( number >= 4) {
            this.moveCount += 1;
        }

    }
}
