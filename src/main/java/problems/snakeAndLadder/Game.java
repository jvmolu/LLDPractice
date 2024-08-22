package problems.snakeAndLadder;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Game {
    Queue<Player> players;
    Board board;
    PlayerManager playerManager;
    Display display;
    DiceManager diceManager;
    int numberOfPlayers;
    int numberOfCells;
    int numberOfDices;

    Game() {
        players = new LinkedList<>();
        board = new Board();
        playerManager = new PlayerManager();
        display = new Display();
        diceManager = new DiceManager();
    }
    Game(int numberOfCells, int numberOfPlayers, int numberOfDices) {
        players = new LinkedList<>();
        board = new Board(numberOfCells);
        playerManager = new PlayerManager();
        display = new Display();
        diceManager = new DiceManager();
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfCells = numberOfCells;
        this.numberOfDices = numberOfDices;
    }

    public void startGame() {

        Scanner scanner = new Scanner(System.in);

        simulateAddSnakeAndLadder("snake", numberOfCells, board);
        simulateAddSnakeAndLadder("ladder", numberOfCells, board);

        for (int i = 0; i < numberOfDices; i++) {
            diceManager.addDice(new Dice(6));
        }


        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Enter name of player " + i);
            String name = scanner.next();
            playerManager.addPlayer(new Player(name, board.board.get(0)));
            players.add(new Player(name, board.board.get(0)));
        }

        System.out.println("Press any key to start game");
        scanner.next();

        display.displayBoard(board.getBoard().get(0));
        while (players.size() > 1) {

            Player currentPlayer = players.peek();

            System.out.println("Player " + currentPlayer.getName() + " turn");
            System.out.println("Press any key to roll dice");

            scanner.next();

            int steps = currentPlayer.rollDice(diceManager.getDices());
            System.out.println("Player " + currentPlayer.getName() + " rolled " + steps);

            currentPlayer.move(steps);

            if(currentPlayer.isWinner()) {
                System.out.println("Player " + currentPlayer.getName() + " wins");
                players.poll();
            }
            else{
                System.out.println("Player " + currentPlayer.getName() + " is at " + currentPlayer.getCurrentCell().getNumber());
                players.add(players.poll());
            }
        }
    }

    private void simulateAddSnakeAndLadder(String type, int numberOfCells, Board board) {
        int numberOfSnakes = 2;
        int start = 0;
        int end = 0;
        for (int i = 0; i < numberOfSnakes; i++) {
            start = (int) (Math.random() * (numberOfCells - 1)) + 1;
            end = (int) (Math.random() * (numberOfCells - 1)) + 1;
            if (type.equals("snake")) {
                if (start < end) {
                    i--;
                }

            } else if (type.equals("ladder")) {
                if (start > end) {
                    i--;
                }
            }
            board.addSnakeOrLadder(start, end);
        }
    }

    private void addSnakeAndLadder(String type, int numberOfCells, Board board) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of " + type);
        int numberOfSnakes = scanner.nextInt();
        int start = 0;
        int end = 0;
        for (int i = 0; i < numberOfSnakes; i++) {

            System.out.println("Enter start and end of " + type + " " + i);
            start = scanner.nextInt();
            end = scanner.nextInt();

            if (type.equals("snake")) {
                if (start < end) {
                    System.out.println("Invalid snake, start should be greater than end");
                    i--;
                }

            } else if (type.equals("ladder")) {
                if (start > end) {
                    System.out.println("Invalid ladder, start should be less than end");
                    i--;
                }
            }
            board.addSnakeOrLadder(start, end);
        }

    }
}
