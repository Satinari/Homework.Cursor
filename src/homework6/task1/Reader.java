package homework6.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Reader {
    public void amountOfAllChars() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println("The string is - " + string);

        String amountOfPunctuationMarks = string.replaceAll("\\p{Punct}", ""); //Amount of punctuation marks
        int mark = string.length() - amountOfPunctuationMarks.length();

        String amountOfNumbers = amountOfPunctuationMarks.replaceAll("[0-9]", ""); //Amount of numbers
        int number = amountOfPunctuationMarks.length() - amountOfNumbers.length();

        String amountOfSpaces = amountOfNumbers.replaceAll(" ", ""); //Amount of spaces
        int space = amountOfNumbers.length() - amountOfSpaces.length();
        string = amountOfSpaces.toLowerCase();

        HashMap<Character, Integer> countOfChars = new HashMap<>();
        int counter;
        string = string.toLowerCase();

        for (int i = 0; i < string.length(); i++) {
            counter = 0;
            for (int j = 0; j < string.length(); j++) {
                if (string.charAt(i) == string.charAt(j)) {
                    counter++;
                }
                countOfChars.put(string.charAt(i), counter);
            }
        }

        for (Map.Entry entry : countOfChars.entrySet()) {
            System.out.println("Letter " + entry.getKey() + " - "
                    + entry.getValue());
        }
        System.out.println("Total amount of letters: " + string.length());
        System.out.println("Amount of spaces: " + space);
        System.out.println("Amount of numbers: " + number);
        System.out.println("Amount of punctuation marks: " + mark);

    }
}

