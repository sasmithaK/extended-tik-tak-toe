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
        board1.identifyCell(cells, userX);
        board1.printBoard(cells);

        System.out.print("User Y: "); // second user
        int userY = read.nextInt();
        board1.identifyCell(cells, userY);
        board1.printBoard(cells);

        System.out.print("User Z: "); // first user
        int userZ = read.nextInt();
        board1.identifyCell(cells, userZ);
        board1.printBoard(cells);

        System.out.print("User T: "); // second user
        int userT = read.nextInt();
        board1.identifyCell(cells, userT);
        board1.printBoard(cells);

    }
}

class CreateBoard {

    String symbol = " ";
    int count = 9;
    int x = 0;

    // check the cell availability

    // identify the cell number and update the array
    void identifyCell(String[][] cells, int userInput) {

        // change symbol between X and 0 accordingly
        while (x < count) {
            if (x % 2 == 0) {

                symbol = "X";
                break;
            } else {

                symbol = "0";
                break;
            }
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
