package homtwork4;

import java.util.ArrayList;

public class MyList <T>{
    private ArrayList<T> arrayList;
    T min = arrayList.get(0);
    T max = arrayList.get(0);
    int n = arrayList.size();

    public MyList(){
        this.arrayList = new ArrayList<>();
    }

    public void add(T value) {
        arrayList.add(value);
    }

    public ArrayList<T> getArrayList() {
        return arrayList;
    }

    public T largest() {
        for (int i = 1; i < n; i++) {
            if (arrayList.get(i) < min) {
                min = arrayList.get(i);
            }
        }
        return min;
    }

    public T smallest() {
        for (int i = 1; i < n; i++) {
            if (arrayList.get(i) > max) {
                max = arrayList.get(i);
            }
        }
        return max;
    }
}
