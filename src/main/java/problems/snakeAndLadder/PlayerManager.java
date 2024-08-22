package problems.snakeAndLadder;

import java.util.ArrayList;
import java.util.Queue;

public class PlayerManager {
    ArrayList<Player> players;
    Queue<Player> playerQueue;


    public PlayerManager() {
        players = new ArrayList<Player>();
    }

    public void addPlayer(Player player) {
        players.add(player);
        playerQueue.add(player);
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }

}
