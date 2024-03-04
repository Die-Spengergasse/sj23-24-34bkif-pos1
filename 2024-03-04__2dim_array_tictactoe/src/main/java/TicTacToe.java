import javax.swing.*;
import java.util.*;

public class TicTacToe {
    static ArrayList<Integer> playerPositions = new ArrayList<>();
    static ArrayList<Integer> cpuPositions = new ArrayList<>();

    public static void main(String[] args) {
    Board gameboard = new Board();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your placement (1-9):");

            int playerPos = scan.nextInt();
            while (playerPositions.contains(playerPos) || cpuPositions.contains(playerPos)) {
                System.out.println("position taken! enter correct Position");
                playerPos = scan.nextInt();
            }

            gameboard.placePiece(playerPos, true);

            Random rand = new Random();
            int cpuPos = rand.nextInt(9) + 1;
            while (playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)) {
                cpuPos = rand.nextInt(9) + 1;
            }

            gameboard.placePiece( cpuPos, false);

            System.out.println(gameboard);

            String result = checkWinner();
            System.out.println(result);
            if (result.contains("win") || result.equals("It's a tie! :/")) {
                break;
            }
        }
    }

    public static void printGameBoard(char[][] gameboard) {
        for (char[] row : gameboard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

 
    public static String checkWinner() {
        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);
        List topCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List botCol = Arrays.asList(3, 6, 9);
        List rightdiagonal = Arrays.asList(1, 5, 9);
        List leftdiagonal = Arrays.asList(3, 5, 7);

        List<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(topCol);
        winning.add(midCol);
        winning.add(botCol);
        winning.add(rightdiagonal);
        winning.add(leftdiagonal);

        for (List l : winning) {

            if (cpuPositions.contains(l)) {
                return "Sorry, CPU wins! :(";
            } else if (playerPositions.containsAll(l)) {
                return "Congratulations! You win! :)";
            } else if (playerPositions.size() + cpuPositions.size() == 9) {
                return "It's a tie! :/";
            }
        }
        return "";
    }

   /* public static String tryAgain() {

    }*/
}