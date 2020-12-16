package racingcar;

public class RacingApplication {

    public static void main(String[] args) {
        int carCount = InputView.scannerCarCount();
        int tryCount = InputView.scannerTryCount();

        ResultView.result(carCount, tryCount);
    }
}
