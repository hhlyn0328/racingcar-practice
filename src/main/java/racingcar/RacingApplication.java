package racingcar;

public class RacingApplication {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        int carCount = inputView.scannerCarCount();
        int tryCount = inputView.scannerTryCount();

        ResultView resultView = new ResultView();
        resultView.result(carCount, tryCount);
    }
}
