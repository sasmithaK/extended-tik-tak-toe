import java.util.Scanner;

public class TikTakToe {
    public static void main(String[] args) {

        // initializations
        String[][] cells = { { " ", " ", " " }, { " ", " ", " " }, { " ", " ", " " } };
        Scanner read = new Scanner(System.in);
        CreateBoard board1 = new CreateBoard();

        // intro prompt
        System.out.println("\nWelcome to \n  !SUPER TIK TAK TOE!\n");

        // take user inputs
        System.out.print("User X: "); // first user
        int userX = read.nextInt();
        while (!board1.isEmptyCell(cells, userX)) {
            System.out.println("Cell already marked. Please select an empty cell.");
            System.out.print("User X: ");
            userX = read.nextInt();
        }
        board1.identifyCell(cells, userX);
        board1.printBoard(cells);

        System.out.print("User Y: "); // second user
        int userY = read.nextInt();
        while (!board1.isEmptyCell(cells, userY)) {
            System.out.println("Cell already marked. Please select an empty cell.");
            System.out.print("User Y: ");
            userY = read.nextInt();
        }
        board1.identifyCell(cells, userY);
        board1.printBoard(cells);
    }
}

class CreateBoard {

    String symbol = " ";
    int x = 0;

    // check if the cell is empty
    boolean isEmptyCell(String[][] cells, int userInput) {
        switch (userInput) {
            case 1:
                return cells[0][0].equals(" ");
            case 2:
                return cells[0][1].equals(" ");
            case 3:
                return cells[0][2].equals(" ");
            case 4:
                return cells[1][0].equals(" ");
            case 5:
                return cells[1][1].equals(" ");
            case 6:
                return cells[1][2].equals(" ");
            case 7:
                return cells[2][0].equals(" ");
            case 8:
                return cells[2][1].equals(" ");
            case 9:
                return cells[2][2].equals(" ");
            default:
                return false;
        }
    }

    // identify the cell number and update the array
    void identifyCell(String[][] cells, int userInput) {

        // change symbol between X and 0 accordingly
        if (x % 2 == 0) {
            symbol = "X";
        } else {
            symbol = "0";
        }

        if (userInput <= 0 || userInput >= 10) {
            System.out.println("Invalid input!");

        } else {
            switch (userInput) {
                case 1:
                    cells[0][0] = symbol;
                    break;
                case 2:
                    cells[0][1] = symbol;
                    break;
                case 3:
                    cells[0][2] = symbol;
                    break;
                case 4:
                    cells[1][0] = symbol;
                    break;
                case 5:
                    cells[1][1] = symbol;
                    break;
                case 6:
                    cells[1][2] = symbol;
                    break;
                case 7:
                    cells[2][0] = symbol;
                    break;
                case 8:
                    cells[2][1] = symbol;
                    break;
                case 9:
                    cells[2][2] = symbol;
                    break;
            }
        }
        x++;
    }

    // print the tiktaktoe board with the corresponding array values
    void printBoard(String[][] cells) {
        String boarder = "  +-----+-----+-----+";
        System.out.println(boarder);
        for (int i = 0; i < 3; i++) {
            System.out.print("  | ");

            for (int j = 0; j < 3; j++) {
                System.out.print(" " + cells[i][j] + "  | "); // array values
            }

            System.out.println("\n" + boarder);
        }

    }
}
