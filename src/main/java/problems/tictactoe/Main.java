package problems.tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter number of players: ");
        Scanner scanner = new Scanner(System.in);
        int numPlayers = scanner.nextInt();

        System.out.println("Enter board size: ");
        int boardSize = scanner.nextInt();

        Game game = new Game(numPlayers, boardSize);

    }
}
