package racingcar;

import java.util.Scanner;

public class InputView {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int scannerCarCount() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        return SCANNER.nextInt();
    }

    public static int scannerTryCount() {
        System.out.println("시도할 회수는 몇 대 인가요?");
        return SCANNER.nextInt();
    }
}
