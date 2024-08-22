package problems.snakeAndLadder;

import java.util.ArrayList;

public class Player {
    private String name;
    private Cell currentCell;
    private boolean isWinner;
    public Player(String name, Cell currentCell) {
        this.name = name;
        this.currentCell = currentCell;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Cell getCurrentCell() {
        return currentCell;
    }
    public void setCurrentCell(Cell currentCell) {
        this.currentCell = currentCell;
    }
    public boolean isWinner() {
        return isWinner;
    }
    public void setWinner(boolean isWinner) {
        this.isWinner = isWinner;
    }

    public int rollDice(ArrayList<Dice> dices) {
        int total = 0;
        for (Dice dice : dices) {
            total += dice.Generate().getValue();
        }
        return total;
    }

    public void move(int steps) {
        Cell newCell = currentCell;
        for (int i = 0; i < steps; i++) {
            newCell = newCell.getNext();
            if (newCell == null) {
                System.out.println("Player " + name + " reached the end of the board");
                isWinner = true;
                break;
            }
        }
        if(newCell != null && newCell.getStopNext() != null) {
            currentCell = newCell.getStopNext();
        }
        else{
            currentCell = newCell;
        }
    }
}
