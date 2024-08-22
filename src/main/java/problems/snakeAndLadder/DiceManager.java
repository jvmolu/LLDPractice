package problems.snakeAndLadder;

import java.util.ArrayList;

public class DiceManager {
    ArrayList<Dice> dices;

    public DiceManager() {
        dices = new ArrayList<Dice>();
    }

    public void addDice(Dice dice) {
        dices.add(dice);
    }

    public ArrayList<Dice> getDices() {
        return dices;
    }

    public void setDices(ArrayList<Dice> dices) {
        this.dices = dices;
    }

    public void removeDice(Dice dice) {
        dices.remove(dice);
    }


}
