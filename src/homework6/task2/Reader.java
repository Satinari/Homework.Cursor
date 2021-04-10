package homework6.task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public void readerFromUrl() throws IOException {
        String src = "src\\homework6\\task2\\text";
        File file = new File(src);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
        fr.close();
    }
}
