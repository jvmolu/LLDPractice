package problems.snakeAndLadder;

public enum Faces {
    ONE(1, "*"),
    TWO(2, "**"),
    THREE(3, "***"),
    FOUR(4, "****"),
    FIVE(5, "*****"),
    SIX(6, "******");

    private final int value;
    private final String face;
    Faces(int value, String face) {
        this.value = value;
        this.face = face;
    }
    public int getValue() {
        return value;
    }
    public String getFace() {
        return face;
    }
}
