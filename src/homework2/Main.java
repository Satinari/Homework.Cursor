package homework2;

public class Main {
    public static void main(String[] args) {
        //1. Write a class Circle and a method that will return its area.
        System.out.println("Exercise 1: ");
        Circle circle = new Circle();
        circle.area(5);
        System.out.println("\n");

        //2. Write a class that can count the number of created objects of this class.
        System.out.println("Exercise 2: ");
        Counter objectOne = new Counter();
        System.out.println("New objects created: " + Counter.count);
        Counter objectTwo = new Counter();
        System.out.println("New objects created: " + Counter.count);
        System.out.println("\n");

        //3. Write the class "car", which should be able to start, turn off the engine, drive and maintain the required speed.
        System.out.println("Exercise 3: ");
        Car car = new Car();
        car.startOfDriving();
        car.speedOfDriving(100, 20); // 1st parameter - desired speed, 2nd parameter - acceleration
        car.speedOfDriving(0, 20); //deceleration
        car.stopOfDriving();
        System.out.println("\n");

        //4*. Class Signed fractional number (Fractions). The number must be represented by two fields: the whole part is a long integer,
        // the fractional part is a short integer. Implement arithmetic operations for addition, subtraction, multiplication,
        // and comparison operations. Check these methods in the main function.
        System.out.println("Exercise 4: ");
        Fraction fraction1 = new Fraction(1L, (short) 5);
        Fraction fraction2 = new Fraction(1L, (short) 6);
        boolean result;
        Fraction resultOfOperations = fraction1.addition(fraction2);
        System.out.printf("(%s) + (%s) = (%s)\n", fraction1, fraction2, resultOfOperations);
        resultOfOperations = fraction1.subtraction(fraction2);
        System.out.printf("(%s) - (%s) = (%s)\n", fraction1, fraction2, resultOfOperations);
        resultOfOperations = fraction1.multiplication(fraction2);
        System.out.printf("(%s) * (%s) = (%s)\n", fraction1, fraction2, resultOfOperations);
        resultOfOperations = fraction1.division(fraction2);
        System.out.printf("(%s) / (%s) = (%s)\n", fraction1, fraction2, resultOfOperations);
        result = fraction1.isEqual(fraction2);
        System.out.printf("(%s) == (%s): %s\n", fraction1, fraction2, result);
        result = fraction1.isBigger(fraction2);
        System.out.printf("(%s) > (%s): %s\n", fraction1, fraction2, result);
        result = fraction1.isBiggerOrEqual(fraction2);
        System.out.printf("(%s) >= (%s): %s\n", fraction1, fraction2, result);
        System.out.println("\n");

        //5*. Money class for working with sums of money. The number must be represented by two fields:
        // long type for hryvnia and byte type - for kopecks. Fractional part (penny) when displayed on the screen should be
        // separated from the integer part by a comma. Implement addition, subtraction, division of sums, division of a sum by a fractional number,
        // fractional multiplication and comparison operations. Check these methods in the main function.
        System.out.println("Exercise 5: ");
        Money money1 = new Money(5L, (byte) 40);
        Money money2 = new Money(10L, (byte) 60);
        double number = 5.4;
        Money moneyOperationResult = money1.addition(money2);
        boolean moneyResult;
        System.out.printf("%s + %s = %s\n", money1, money2, moneyOperationResult);
        moneyOperationResult = money1.subtraction(money2);
        System.out.printf("%s - %s = %s\n", money1, money2, moneyOperationResult);
        moneyOperationResult = money1.division(money2);
        System.out.printf("%s / %s = %s\n", money1, money2, moneyOperationResult);
        moneyOperationResult = money1.multiplication(money2);
        System.out.printf("%s * %s = %s\n", money1, money2, moneyOperationResult);
        moneyOperationResult = money1.divisionToDouble(number);
        System.out.printf("%s / %s = %s\n", money1, number, moneyOperationResult);
        moneyOperationResult = money1.multiplicationToDouble(number);
        System.out.printf("%s * %s = %s\n", money1, number, moneyOperationResult);
        moneyResult = money1.isEqual(money2);
        System.out.printf("%s == %s: %s\n", money1, money2, moneyResult);
        moneyResult = money1.isBigger(money2);
        System.out.printf("%s > %s: %s\n", money1, money2, moneyResult);
        moneyResult = money1.isBiggerOrEqual(money2);
        System.out.printf("%s >= %s: %s\n", money1, money2, moneyResult);
    }
}
