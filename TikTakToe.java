import java.util.Scanner;

public class TikTakToe {
    public static void main(String[] args) {

        // initializations
        String[][] cells = { { " ", " ", " " }, { " ", " ", " " }, { " ", " ", " " } };
        Scanner read = new Scanner(System.in);
        CreateBoard game1 = new CreateBoard();

        // intro prompt
        System.out.println("\nWelcome..! fellow traveler..... \nThis is my first JAVA project....");
        System.out.println("\n! TIK TAK TOE !\n");
        System.out.println("\nThis is how the cells in the board are arrenged.\n");
        System.err.println("+-----+-----+-----+\r\n" + "|  1  |  2  |  3  |\r\n" + "+-----+-----+-----+\r\n"
                + "|  4  |  5  |  6  |\r\n" + "+-----+-----+-----+\r\n" + "|  7  |  8  |  9  |\r\n"
                + "+-----+-----+-----+");
        System.out.println("\nLet's start the game......!!!\n");
        System.out.print("Enter player 1 name : ");
        String userName1 = read.nextLine();
        System.out.print("Enter player 2 name : ");
        String userName2 = read.nextLine();

        // take user inputs
        for (int i = 0; i < 10; i++) {
            System.out.print(userName1 + " : "); // first user
            int userX = read.nextInt();
            while (!game1.isEmptyCell(cells, userX)) {
                System.out.println("Cell already marked. Please select an empty cell.");
                System.out.print(userName1 + " : ");
                userX = read.nextInt();
            }
            game1.identifyCell(cells, userX);
            game1.printBoard(cells);
            if (game1.hasWinner(cells)) {
                System.out.println("\n!! The winner is " + userName1 + "\n");
                read.close();
                return;
            }

            System.out.print(userName2 + " : "); // second user
            int userY = read.nextInt();
            while (!game1.isEmptyCell(cells, userY)) {
                System.out.println("Cell already marked. Please select an empty cell.");
                System.out.print(userName2 + " : ");
                userY = read.nextInt();
            }
            game1.identifyCell(cells, userY);
            game1.printBoard(cells);
            if (game1.hasWinner(cells)) {
                System.out.println("\n!! The winner is " + userName2 + "\n");
                read.close();
                return;
            }
        }

        read.close();
    }
}

class CreateBoard {

    String symbol = " ";
    int symbolChanger = 0;

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
        if (symbolChanger % 2 == 0) {
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
        symbolChanger++;
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

    // check the if there is a winner
    boolean hasWinner(String[][] cells) {

        // check rows
        for (int i = 0; i < 3; i++) {
            if (cells[i][0].equals(cells[i][1]) && cells[i][1].equals(cells[i][2]) && !cells[i][0].equals(" ")) {
                return true;
            }
        }

        // check colsumns
        for (int j = 0; j < 3; j++) {
            if (cells[0][j].equals(cells[1][j]) && cells[1][j].equals(cells[2][j]) && !cells[0][j].equals(" ")) {
                return true;
            }
        }

        // check diagonals(\)
        if (cells[0][0].equals(cells[1][1]) && cells[1][1].equals(cells[2][2]) && !cells[0][0].equals(" ")) {
            return true;
        }

        // check diagonals(/)
        if (cells[2][0].equals(cells[1][1]) && cells[1][1].equals(cells[0][2]) && !cells[2][0].equals(" ")) {
            return true;
        }

        return false;
    }
}
