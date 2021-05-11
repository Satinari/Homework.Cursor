package homework6.task2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Reader reader = new Reader("src\\homework6\\homework8.homework12.task2\\text");
        reader.readerFromFile();

        System.out.println("Short word is: " + reader.shortWords() + ", number of word in the text: " + reader.getValueHashMap(reader.shortWords()));
        System.out.println("Long word is: " + reader.longWords() + ", number of word in the text: " + reader.getValueHashMap(reader.longWords()));
    }
}
