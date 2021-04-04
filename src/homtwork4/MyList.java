package homtwork4;

import java.util.ArrayList;
import java.util.Collections;

public class MyList <T extends Number & Comparable<? super T>>{
    private ArrayList<T> arrayList;

    public MyList() {
        this.arrayList = new ArrayList<>();
    }

    public void add(T value) {
        arrayList.add(value);
    }

    public ArrayList<T> getArrayList() {
        return arrayList;
    }

    public void largest() {
        Collections.sort(arrayList);
        System.out.println("Largest number is "+ arrayList.get(arrayList.size() -1));
    }

    public void smallest() {
        Collections.sort(arrayList);
        System.out.println("Smallest number is "+ arrayList.get(0));
    }
}
