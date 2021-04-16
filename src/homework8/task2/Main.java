package homework8.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SafeDivision safeDivision = new SafeDivision();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Division result: " + safeDivision.division(scanner));
    }
}
