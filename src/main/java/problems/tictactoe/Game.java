package problems.tictactoe;

import problems.tictactoe.model.*;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.Scanner;

public class Game {

    Queue<PlayerPiece> queue;

    Board board;

    DisplayBoard displayBoard;

    public Game(int numPlayers, int boardSize) {
        startGame(numPlayers, boardSize);
    }

    public void startGame(int numPlayers, int boardSize) {

        board = new Board(boardSize);
        queue = new LinkedList<>();
        displayBoard = new DisplayBoard(board);

        for (int i = 0; i < numPlayers; i++) {

            System.out.println("Enter your name: ");
            Scanner playerName = new Scanner(System.in);
            String name = playerName.nextLine();

            System.out.println("Enter your symbol: ");
            Scanner playerSymbol = new Scanner(System.in);
            String symbol = playerSymbol.nextLine();

            queue.add(new PlayerPiece(PieceType.valueOf(symbol.toUpperCase()), new Player(name)));
        }

        while (!board.isFull()) {

            PlayerPiece playerPiece = queue.peek();
            displayBoard.display();

            assert playerPiece != null;
            System.out.println("Player " + playerPiece.getPlayer().getName() + " turn");

            System.out.println("Enter space separated x and y coordinates: ");
            Scanner move = new Scanner(System.in);
            int x = move.nextInt();
            int y = move.nextInt();

            if(board.setPiece(playerPiece, x, y)) {
                if (board.isWinningMove(playerPiece, x, y)) {
                    System.out.println("Player " + playerPiece.getPlayer().getName() + " wins");
                    break;
                }

                queue.add(queue.poll());

            } else {
                System.out.println("Invalid move, try again");
            }

        }

    }


}
