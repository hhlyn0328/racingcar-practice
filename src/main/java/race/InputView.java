package race;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String STRING_SPLIT_TEXT = ",";

    public static String[] inputCarCount() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉽표(,)를 기준으로 구분. ");
        return scanner.nextLine().split(STRING_SPLIT_TEXT);

    }

    public static int inputRaceCount() {
        System.out.println("시도할 회수는 몇 회 인가요? ");
        return scanner.nextInt();
    }
}
