import calculator.CalResult;
import calculator.Formula;
import race.*;

import java.util.List;
import java.util.Scanner;

public class RacingCarApplication {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("연산식 입력 . >> ");
//        String formula = scanner.nextLine();
//        String[] formulas = formula.split(" ");
//
//        Formula reqFormula = new Formula(formulas);
//
//        CalResult result = reqFormula.calculate();
//
//        System.out.println("결과는 . >> " + result.getResult());

        InputView inputView = new InputView();
        int carCount = inputView.inputCarCount();
        int raceCount = inputView.inputRaceCount();

        RaceResult raceResult = new RaceResult(carCount, raceCount);
        raceResult.startRace();
        ResultView resultView = new ResultView(raceResult.getRaceResult());
        resultView.print();


    }
}
