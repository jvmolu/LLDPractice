package problems.tictactoe.model;

public class PlayerPiece {
    private final PieceType pieceType;
    private final Player player;

    public PlayerPiece(PieceType pieceType, Player player) {
        this.pieceType = pieceType;
        this.player = player;
    }

    public PieceType getPieceType() {
        return pieceType;
    }

    public Player getPlayer() {
        return player;
    }
}
