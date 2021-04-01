package homtwork4;

import java.util.ArrayList;
import java.util.Comparator;

public class MyList <T extends Number & Comparable> {
    private ArrayList<T> arrayList;
    private Comparator<T> comparator;

    public MyList() {
        this.arrayList = new ArrayList<>();
        this.comparator = new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return o1.compareTo(o2);
            }
        };
    }

    public void add(T value) {
        arrayList.add(value);
    }

    public ArrayList<T> getArrayList() {
        return arrayList;
    }

    public void largest() {
        arrayList.sort(comparator);
        System.out.println("Largest number is "+ arrayList.get(arrayList.size() -1));
    }

    public void smallest() {
        arrayList.sort(comparator);
        System.out.println("Smallest number is "+ arrayList.get(0));
    }
}
