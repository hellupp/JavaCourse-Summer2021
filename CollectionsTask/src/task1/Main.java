package task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(4);
        arrayList.add(-4);
        arrayList.add(4);
        arrayList.add(0);
        arrayList.add(4);
        arrayList.add(0);
        arrayList.add(-2);
        CountingElements elems = new CountingElements(arrayList);

        System.out.println(elems.countElements());
    }
}
