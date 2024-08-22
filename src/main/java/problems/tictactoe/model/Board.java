package problems.tictactoe.model;

public class Board {
    private final int size;
    private final PlayerPiece[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new PlayerPiece[size][size];
    }

    public int getSize() {
        return size;
    }

    public PlayerPiece[][] getBoard() {
        return board;
    }

    public boolean setPiece(PlayerPiece playerPiece, int x, int y) {

        if (getPiece(x, y) != null) {
               return false;
        }
        board[x][y] = playerPiece;
        return true;
    }

    public PlayerPiece getPiece(int x, int y) {
        return board[x][y];
    }

    public boolean isFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isWinningMove(PlayerPiece playerPiece, int x, int y) {
        return checkRow(playerPiece, x) || checkColumn(playerPiece, y) || checkDiagonal(playerPiece) || checkAntiDiagonal(playerPiece);
    }

    private boolean checkRow(PlayerPiece playerPiece, int x) {
        for (int i = 0; i < size; i++) {
            if (board[x][i] == null || board[x][i].getPieceType() != playerPiece.getPieceType()) {
                return false;
            }
        }
        return true;
    }

    private boolean checkColumn(PlayerPiece playerPiece, int y) {
        for (int i = 0; i < size; i++) {
            if (board[i][y] == null || board[i][y].getPieceType() != playerPiece.getPieceType()) {
                return false;
            }
        }
        return true;
    }

    private boolean checkDiagonal(PlayerPiece playerPiece) {

        for (int i = 0; i < size; i++) {
            if (board[i][i] == null || board[i][i].getPieceType() != playerPiece.getPieceType()) {
                return false;
            }
        }
        return true;
    }

    private  boolean checkAntiDiagonal(PlayerPiece playerPiece) {
        for (int i = 0; i < size; i++) {
            if (board[i][size - i - 1] == null || board[i][size - i - 1].getPieceType() != playerPiece.getPieceType()) {
                return false;
            }
        }
        return true;
    }
}
