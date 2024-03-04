import java.util.ArrayList;
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
            while (true) {
                try {
                    gameboard.placePiece(rand.nextInt(9) + 1, false);
                    break;
                } catch (Exception e) {
                }
            }
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