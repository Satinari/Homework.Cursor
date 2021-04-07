package homework6.task1;

//Write a program that accepts an object of type
//String, and returns the following data:
//All the letters that make up the string and their number occurrences
// (case insensitive, "A" .equals ("a"))

//1) total amount of letters

//2)amount of spaces

//3)amount of numbers

//4)amount of punctuation marks


public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader();
        System.out.println(reader.amountOfAllChars());
    }
}
