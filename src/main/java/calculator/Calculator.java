package calculator;

public class Calculator {
    public boolean isExists(String symbol) {
        for (Symbol operationSymbol : Symbol.values()) {
            if (operationSymbol.getSymbol().equals(symbol)) {
                return true;
            }
        }

        return false;
    }

    public int toInt(String symbol) {
        return Integer.parseInt(symbol);
    }

    public Symbol toEnum(String symbol) {
        for (Symbol operationSymbol : Symbol.values()) {
            if (operationSymbol.getSymbol().equals(symbol)) {
                return operationSymbol;
            }
        }

        throw new IllegalArgumentException("잘못된 기호입니다.");
    }
}
