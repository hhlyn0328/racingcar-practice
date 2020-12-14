import java.util.Scanner;

public class CalculateApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("연산식 입력 . >> ");
        String formula = input.nextLine();
        String[] formulas = formula.split(" ");

        Formula reqFormula = new Formula(formulas);

        CalResult result = reqFormula.calculate();

        System.out.println("결과는 . >> " + result.getResult());

    }
}
