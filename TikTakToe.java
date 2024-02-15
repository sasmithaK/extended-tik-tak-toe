import java.util.Scanner;

public class TikTakToe {
    public static void main(String[] args) {

        String[][] rows = {
                { " ", " ", " " },
                { " ", " ", " " },
                { " ", " ", " " }
        };

        System.out.println("\nWelcome to \n  !SUPER TIK TAK TOE!\n");

        Scanner sc = new Scanner(System.in);
        createBoard board1 = new createBoard();

        for (int q = 0; q < 5; q++) {
            System.out.print("A's move : ");
            String userInput = sc.nextLine();

            board1.Row(userInput, rows);
            board1.printBoard(rows);

            System.out.print("B's move : ");
            String userInput2 = sc.nextLine();

            board1.Row(userInput2, rows);
            board1.printBoard(rows);
        }
    }
}

class createBoard {

    void Row(String userInput, String[][] rows) {
        switch (userInput) {
            case "1":
                rows[0][0] = "X";
                break;
            case "2":
                rows[1][0] = "X";
                break;
            case "3":
                rows[2][0] = "X";
                break;
            case "4":
                rows[0][1] = "X";
                break;
            case "5":
                rows[1][1] = "X";
                break;
            case "6":
                rows[2][1] = "X";
                break;
            case "7":
                rows[0][2] = "X";
                break;
            case "8":
                rows[1][2] = "X";
                break;
            case "9":
                rows[2][2] = "X";
                break;
        }
    }

    // create board..........................................................
    void printBoard(String[][] rows) {
        String boarder = "  +-----+-----+-----+";

        System.out.println(boarder);
        for (int i = 0; i < 3; i++) {
            System.out.print("  | ");

            for (int j = 0; j < 3; j++) {
                System.out.print(" " + rows[i][j] + "  | ");
            }

            System.out.println("\n" + boarder);
        }
    }
}
