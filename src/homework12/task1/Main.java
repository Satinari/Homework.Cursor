package homework12.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number from 0 to 10 ");
        int numMark = scanner.nextInt();
        String mark = switch (numMark) {
            case 0, 1, 2, 3, 4 -> "Awful";
            case 5 -> "Bad";
            case 6 -> "Acceptable";
            case 7, 8 -> "Good";
            case 9, 10 -> "Very good";
            default -> ("Unexpected value: " + numMark);
        };
        System.out.println(mark);
    }
}
