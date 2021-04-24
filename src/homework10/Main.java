package homework10;

import java.util.ArrayList;
import java.util.ListIterator;

public class  Main {
    public static void main(String[] args) throws Exception {
        //Instantiating an ArrayList object
        ArrayList<String> list = new ArrayList<String>();
        //populating the ArrayList
        list.add("apples");
        list.add("mangoes");
        list.add("oranges");
        //Getting the Iterator object of the ArrayList
        ListIterator<String> it = list.listIterator();
        while(it.hasNext()) {
            it.add("");
        }
    }
}




