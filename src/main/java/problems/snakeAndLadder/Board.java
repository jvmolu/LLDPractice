package problems.snakeAndLadder;

import java.util.ArrayList;

public class Board {
    ArrayList<Cell> board;

    public Board() {
        board = new ArrayList<Cell>();
    }

    public Board(int size) {
        board = new ArrayList<Cell>();
        for (int i = 0; i < size; i++) {
            board.add(new Cell(i, null, null));
        }

        for(int i = 0; i < size - 1; i++) {
            board.get(i).setNext(board.get(i + 1));
        }
    }

    public void addCell(Cell cell) {
        board.add(cell);
    }

    public ArrayList<Cell> getBoard() {
        return board;
    }

    public void setBoard(ArrayList<Cell> board) {
        this.board = board;
    }



    public Cell getCell(int number) {
        return board.get(number);
    }

    public void addSnakeOrLadder(int start, int end) {
        Cell startCell = board.get(start);
        Cell endCell = board.get(end);
        startCell.setStopNext(endCell);
    }

}
