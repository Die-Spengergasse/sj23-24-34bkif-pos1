import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Board gameboard = new Board();
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        while (true) {
            while (true) {
                try {
                    System.out.println("Enter your placement (1-9):");
                    int playerPos = scan.nextInt();
                    Integer bestChoice = gameboard.gewinnPlatz(true);
                    if (bestChoice!=null && bestChoice != playerPos) {
                        System.out.println("Hey you could have won!");
                    }
                    bestChoice = gameboard.gewinnPlatz(false);
                    if (bestChoice!=null && bestChoice != playerPos) {
                        System.out.println("Hey now I win");
                    }
                    gameboard.placePiece(playerPos, true);
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println(gameboard);
            if (gameboard.checkWinner(true)) {
                System.out.println("Player wins");
                break;
                // System.exit(0);
            }
            // CPU's turn
            if (gameboard.isFull()) {
                System.out.println("Both win, board is full");
                break;
            }
            // CPU spielt:
            gameboard.placePiece(gameboard.findBestPlaceFor(false), false);
            System.out.println(gameboard);
            if (gameboard.checkWinner(false)) {
                System.out.println("CPU wins");
                break;
                // System.exit(0);
            }
            if (gameboard.isFull()) {
                System.out.println("Both win, board is full");
                break;
            }
        }
    }
}