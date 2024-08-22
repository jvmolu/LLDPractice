package problems.snakeAndLadder;

public class Cell {
    private int number;
    Cell next;
    Cell stopNext;  // this is next cell when player stops on this cell and next turn starts from this cell
    Cell(int number, Cell next, Cell stopNext) {
        this.number = number;
        this.next = next;
        this.stopNext = stopNext;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public Cell getNext() {
        return next;
    }
    public void setNext(Cell next) {
        this.next = next;
    }
    public Cell getStopNext() {
        return stopNext;
    }
    public void setStopNext(Cell stopNext) {
        this.stopNext = stopNext;
    }
}
