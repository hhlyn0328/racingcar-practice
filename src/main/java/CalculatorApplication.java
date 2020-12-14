import java.util.Scanner;

public class CalculatorApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("연산식 입력 : ");

        String input = sc.nextLine();

        System.out.println("연산 결과 : ");
        Calculator calculator = new Calculator();
        System.out.println(calculator.totalCalculation(input));
    }
}
