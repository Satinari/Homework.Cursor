//package homework6.task2;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
//
//public class Reader {
//    public String readerFromUrl() throws IOException {
//
//        String src = "src\\homework6\\task2\\text";
//        HashMap<Character, Integer> setOfWords = new HashMap<>();
//        int counter;
//        src = src.toLowerCase();
//
//        try(FileReader in = new FileReader(src);
//            BufferedReader reader = new BufferedReader(in))
//        {
//            while (reader.ready())
//            {
//                for (int i = 0; i < src.length(); i++) {
//                    counter = 0;
//                    for (int j = 0; j < src.length(); j++) {
//                        if (src.charAt(i) == src.charAt(j)) {
//                            counter++;
//                        }
//                        setOfWords.put(src.charAt(i), counter);
//                    }
//                }
//
//                for (Map.Entry entry : setOfWords.entrySet()) {
//                    setOfWords.values().stream().min(Integer::compareTo);
//                    System.out.println("Lowest word is: " + entry);
//                }
//
//                for (Map.Entry entry : setOfWords.entrySet()) {
//                    setOfWords.values().stream().max(Integer::compareTo);
//                    System.out.println("bigger word is: " + entry);
//                }
//            }
//        }
//
//        return "";
//    }
//}
