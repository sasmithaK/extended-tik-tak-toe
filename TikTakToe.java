import java.util.Scanner;

public class TikTakToe {
    public static void main(String[] args) {
        int colIndex = 0, rowIndex = 0;
        int[][] cells = new int[3][3];

        Scanner read = new Scanner(System.in);
        CreateBoard board1 = new CreateBoard();

        System.out.println("\nWelcome to \n  !SUPER TIK TAK TOE!\n");

        System.out.print("Move 1: ");
        int userX = read.nextInt();
        board1.identifyCell(userX, colIndex, rowIndex);
        cells[colIndex][rowIndex] = userX;
        board1.printBoard(cells);

        System.out.print("Move 2: ");
        int userY = read.nextInt();
        board1.identifyCell(userY, colIndex, rowIndex);
        cells[colIndex][rowIndex] = userY;
        board1.printBoard(cells);

    }
}

class CreateBoard {

    void identifyCell(int userInput, int colIndex, int rowIndex) {

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

    void printBoard(int[][] cell) {
        String boarder = "  +-----+-----+-----+";
        System.out.println(boarder);
        for (int i = 0; i < 3; i++) {
            System.out.print("  | ");

            for (int j = 0; j < 3; j++) {
                System.out.print(" " + cell[i][j] + "  | ");
            }

            System.out.println("\n" + boarder);
        }

    }
}
