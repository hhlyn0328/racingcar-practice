package racingcar;

import java.util.Scanner;

public class InputView {

    public int scannerCarCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("자동차 대수는 몇 대 인가요?");
        return scanner.nextInt();
    }

    public int scannerTryCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("시도할 회수는 몇 대 인가요?");
        return scanner.nextInt();
    }
}
