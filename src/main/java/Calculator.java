import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Integer> numbers = new ArrayList<>();
    private List<String> symbols = new ArrayList<>();

    private boolean isSymbolIndex(int i) {
        return i % 2 == 1;
    }

    void parseInput(String input) {
        String[] splitedInput = input.split(" ");
        for (int i = 0; i < splitedInput.length; i++) {
            if (isSymbolIndex(i)) {
                this.symbols.add(splitedInput[i]);
            } else {
                this.numbers.add(Integer.parseInt(splitedInput[i]));
            }
        }
    }

    public int calculation(int firstNumber, String symbol, int secondNumber) {
        switch (symbol) {
            case "+":
                return Operator.PLUS.calculate(firstNumber, secondNumber);
            case "-":
                return Operator.MINUS.calculate(firstNumber, secondNumber);
            case "/":
                return Operator.DIVISION.calculate(firstNumber, secondNumber);
            case "*":
                return Operator.MULTIPLY.calculate(firstNumber, secondNumber);
        }
        return 0;
    }

    public int totalCalculation(String input) {
        parseInput(input);
        int calcResult = this.numbers.get(0);
        for (int i = 0; i < this.symbols.size(); i++) {
            calcResult = calculation(calcResult, this.symbols.get(i), this.numbers.get(i + 1));
        }
        return calcResult;
    }
}
