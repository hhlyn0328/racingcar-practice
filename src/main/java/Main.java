import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner formula = new Scanner(System.in);
        System.out.println("연산식 입력 . >> ");
        String formulaString = formula.nextLine();
        String[] formulas = formulaString.split(" ");

        Formula reqFormula = new Formula(formulas);

        CalResult result = reqFormula.calculate();

        System.out.println("결과는 . >> " + result.getResult());

    }
}
