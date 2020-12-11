import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculrator {

    private List<Integer> numbers = new ArrayList<>();
    private List<String> symbols = new ArrayList<>();

    public static int plus(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int minus(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public static int division(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public static int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public Integer numberIsNotNull(Integer number) {
        if (number == null) {
            throw new IllegalArgumentException();
        }
        return number;
    }

    public String symbolValidation(String symbol) {
        if (!symbol.equals("+") && !symbol.equals("-") && !symbol.equals("/") && !symbol.equals("*")) {
            throw new IllegalArgumentException();
        }
        return symbol;
    }

    public List<Integer> getNumbers(String input) {
        String[] stringArr = input.split(" ");
        for (int i = 0; i < stringArr.length; i = i + 2) {
            this.numbers.add(Integer.parseInt(stringArr[i]));
        }
        return numbers;
    }

    public List<String> getSymbols(String input) {
        String[] stringArr = input.split(" ");
        for (int i = 1; i < stringArr.length; i = i + 2) {
            this.symbols.add(symbolValidation(stringArr[i]));
        }
        return symbols;
    }

    public int calculration(int firstNumber, String symbol, int secondNumber) {
        switch (symbol) {
            case "+":
                return plus(firstNumber, secondNumber);
            case "-":
                return minus(firstNumber, secondNumber);
            case "/":
                return division(firstNumber, secondNumber);
            case "*":
                return multiply(firstNumber, secondNumber);
        }
        return 0;
    }

    public int totalCalculration(String input) {

        List<Integer> numbers = getNumbers(input);
        List<String> symbols = getSymbols(input);

        int temp = numbers.get(0);
        for (int i = 0; i < symbols.size(); i++) {
            temp = calculration(temp, symbols.get(i), numbers.get(i + 1));
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("연산식 입력 : ");
        String input = sc.nextLine();
        System.out.println("연산 결과 : ");
        Calculrator calculrator = new Calculrator();
        System.out.println(calculrator.totalCalculration(input));
    }
}
