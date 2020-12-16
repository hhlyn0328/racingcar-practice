package race;

public class Car {
    private static int limit = 4;
    private int moveCount;

    public Car(int move) {
        this.moveCount = move;
    }

    public int getMove() {
        return this.moveCount;
    }

    public void move(int number) {
        if( number >= limit) {
            this.moveCount += 1;
        }

    }
}
