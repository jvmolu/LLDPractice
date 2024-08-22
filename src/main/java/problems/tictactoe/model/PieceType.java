package problems.tictactoe.model;

public enum PieceType {
    ZERO("0"),
    CROSS("X");

    private final String symbol;

    PieceType(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

}

