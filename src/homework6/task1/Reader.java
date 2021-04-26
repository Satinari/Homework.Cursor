package homework6.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Reader {
    String string = new Scanner(System.in).nextLine();

    public void amountOfAllChars(){

        System.out.println("The string is - " + string);

        HashMap<Character, Integer> countOfChars = new HashMap<>();
        int counter;
        string = string.toLowerCase();

        for (int i = 0; i < string.length(); i++) {
            counter = 0;
            for (int j = 1; j < string.length(); j++) {
                if (string.charAt(i) == string.charAt(j)) {
                    counter++;
                }
                countOfChars.put(string.charAt(i), counter);
            }
        }

        for (Map.Entry<Character, Integer> entry : countOfChars.entrySet()) {
            System.out.println("Letter " + entry.getKey() + " - "
                    + entry.getValue());
        }
        System.out.println("Total amount of letters: " + string.length());
        System.out.println("Amount of spaces: " + amountOfSpaces());
        System.out.println("Amount of numbers: " + amountOfNumbers());
        System.out.println("Amount of punctuation marks: " + amountOfPunctuationMarks());
    }

    public int amountOfPunctuationMarks() {
        return string.length() - string.replaceAll("\\p{Punct}", "").length(); //Amount of punctuation marks
    }

    public int amountOfNumbers() {
        return string.length() - string.replaceAll("[0-9]", "").length(); //Amount of numbers
    }

    public int amountOfSpaces() {
        return string.length() - string.replaceAll(" ", "").length(); //Amount of spaces
    }
}

