import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private static final String BLANK = " ";
    private List<Integer> numbers = new ArrayList<>();
    private List<String> symbols = new ArrayList<>();

    private boolean isSymbolIndex(int i) {
        return i % 2 == 1;
    }

    private void parseInput(String input) {
        String[] splitedInput = input.split(BLANK);
        for (int i = 0; i < splitedInput.length; i++) {
            addSymbolAndNumber(splitedInput, i);
        }
    }

    private void addSymbolAndNumber(String[] splitedInput, int i) {

        if (isSymbolIndex(i)) {
            this.symbols.add(splitedInput[i]);
            return;
        }

        CalculatorValidationUtil.numberIsNotNull(Integer.parseInt(splitedInput[i]));
        this.numbers.add(Integer.parseInt(splitedInput[i]));
    }

    public int calculation(int firstNumber, String symbol, int secondNumber) {
        return Operator.valueOfSymbol(symbol).calculate(firstNumber, secondNumber);
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
