package race;

public class Car {
    private final static int LIMIT = 4;
    private int moveCount;

    public Car(int move) {
        this.moveCount = move;
    }

    public int getMove() {
        return this.moveCount;
    }

    public void move(int number) {
        if( number >= LIMIT) {
            this.moveCount += 1;
        }

    }
}
