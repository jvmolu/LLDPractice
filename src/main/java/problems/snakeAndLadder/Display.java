package problems.snakeAndLadder;

public class Display {

    // Display the board
    public void displayBoard(Cell start) {

        // display the cells in the board also display the snakes and ladders
        Cell current = start;
        while (current != null) {
            System.out.print(current.getNumber());
            if(current.getStopNext() != null){
                if (current.getStopNext().getNumber() > current.getNumber())
                    System.out.print("Ladder to " + current.getStopNext().getNumber());
                else
                    System.out.print("Snake to " + current.getStopNext().getNumber());
            }
            else
                System.out.print(" No Obstacle");
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println();

    }
}
