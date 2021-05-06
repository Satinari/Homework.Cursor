package homework8.task2;

import java.util.Scanner;

public class SafeDivision {
    public int division(Scanner scanner){
        int result;
        System.out.print("Enter A: ");
        int  a = scanner.nextInt();
        System.out.print("Enter B: ");
        int b = scanner.nextInt();
        scanner.close();
        while (true) {
            try {
                result = a / b;
                break;
            } catch (ArithmeticException ignored) {
                System.out.print("Division by zero. Reenter B: ");
                b = scanner.nextInt();
            }
        }
        return result;
    }
}
