package problems.snakeAndLadder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of players");
        int numberOfPlayers = scanner.nextInt();

        System.out.println("Enter number of cells");
        int numberOfCells = scanner.nextInt();

        System.out.println("Enter number of dices");
        int numberOfDices = scanner.nextInt();

        Game game = new Game(numberOfCells, numberOfPlayers, numberOfDices);
        game.startGame();

    }
}
