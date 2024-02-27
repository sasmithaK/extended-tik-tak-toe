import java.util.Scanner;

public class TikTakToe {
    public static void main(String[] args) {

        // initializations
        String[][] markedCells = {
                { " ", " ", " " },
                { " ", " ", " " },
                { " ", " ", " " }
        };

        Scanner read = new Scanner(System.in);
        CreateBoard board1 = new CreateBoard();

        // intro prompt
        System.out.println("\nWelcome to \n  !SUPER TIK TAK TOE!\n");

        // take user inputs
        System.out.print("User X: "); // first user input
        int userX = read.nextInt();
        board1.identifyCell(userX);
        int x = board1.colIndex;
        int y = board1.rowIndex;

        markedCells[x][y] = "X";
        board1.printBoard(markedCells);

        System.out.print("User Y: "); // second user input
        int userY = read.nextInt();
        board1.identifyCell(userY);
        int x1 = board1.colIndex;
        int y1 = board1.rowIndex;

        markedCells[x1][y1] = "0";
        board1.printBoard(markedCells);

    }
}

class CreateBoard {

    // hold 2d array indexes
    int colIndex, rowIndex;

    // identify the cell number of any given input and update the array indexing
    void identifyCell(int userInput) {

        if (userInput <= 0 && userInput >= 11) {
            userInput = 0;
        } else {
            switch (userInput) {
                case 1:
                    colIndex = 0; // 1
                    rowIndex = 0;
                    break;
                case 2:
                    colIndex = 0; // 2
                    rowIndex = 1;
                    break;
                case 3:
                    colIndex = 0; // 3
                    rowIndex = 2;
                    break;
                case 4:
                    colIndex = 1; // 4
                    rowIndex = 0;
                    break;
                case 5:
                    colIndex = 1; // 5
                    rowIndex = 1;
                    break;
                case 6:
                    colIndex = 1; // 6
                    rowIndex = 2;
                    break;
                case 7:
                    colIndex = 2; // 7
                    rowIndex = 0;
                    break;
                case 8:
                    colIndex = 2; // 8
                    rowIndex = 1;
                    break;
                case 9:
                    colIndex = 2; // 9
                    rowIndex = 2;
                    break;
            }

            // figure out a way to replace the switch-case with a loop.

        }

    }

    // print the tiktaktoe board with the corresponding array values
    void printBoard(String[][] markedCells) {
        String boarder = "  +-----+-----+-----+";
        System.out.println(boarder);
        for (int i = 0; i < 3; i++) {
            System.out.print("  | ");

            for (int j = 0; j < 3; j++) {
                System.out.print(" " + markedCells[i][j] + "  | "); // array values
            }

            System.out.println("\n" + boarder);
        }

    }
}
