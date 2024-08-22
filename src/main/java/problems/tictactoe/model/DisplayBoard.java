package problems.tictactoe.model;

public class DisplayBoard {
    private final Board board;

    public DisplayBoard(Board board) {
        this.board = board;
    }

    public void display() {
        for (int i = 0; i < board.getBoard().length; i++) {
            for (int j = 0; j < board.getBoard()[i].length; j++) {

                String symbol = board.getPiece(i, j) == null ? " " : board.getPiece(i, j).getPieceType().getSymbol();
                System.out.print("  " + symbol + "  ");

                if (j < board.getBoard()[i].length - 1) {
                    System.out.print("|");
                }

            }
            System.out.println();
            if (i < board.getBoard().length - 1) {
                System.out.println("-----------------");
            }
        }
    }
}
