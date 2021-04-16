package homework6.task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Reader {
    String src;
    int minWord = 3;
    private final HashMap<String, Integer> words = new HashMap<>();

    public Reader(String src) {
        this.src = src;
    }

    public void readerFromFile() throws IOException {
        File file = new File(src);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null){
            String word = line.replaceAll("[. , ! ; :]", " ");
            System.out.println(word);
            if (words.containsKey(word)) {
                int valueInt = words.get(word) + 1;
                words.put(word, valueInt);
            } else {
                words.put(word, 1);
            }
        }
        br.close();
        fr.close();
    }

    public String longWords() {
        String longWord = "";
        for (Map.Entry entry : words.entrySet()) {
            String entryKey = entry.getKey().toString();
            if (entryKey.length() >= minWord && longWord.length() <= entryKey.length()) {
                if (longWord.length() == entryKey.length()) {
                    if (longWord.compareTo(entryKey) <= 0) {
                        longWord = entryKey;
                    }
                } else {
                    longWord = entryKey.toString();
                }
            }
        }
        return longWord;
    }

    public String shortWords() {
        String shortWord = longWords();
        for (Map.Entry entry : words.entrySet()) {
            String entryKey = entry.getKey().toString();
            if (entryKey.length() >= minWord && shortWord.length() >= entryKey.length()) {
                if (shortWord.length() == entryKey.length()) {
                    if (shortWord.compareTo(entryKey) >= 0) {
                        shortWord = entryKey;
                    }
                } else {
                    shortWord = entryKey.toString();
                }
            }
        }
        return shortWord;
    }

    public Integer getValueHashMap(String string) {
        return words.get(string);
    }
}
