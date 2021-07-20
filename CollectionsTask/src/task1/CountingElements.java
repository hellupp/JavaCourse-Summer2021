package task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountingElements {

    private ArrayList<Integer> array;
    private Map<Integer, Integer> map = new HashMap<>();

    CountingElements() {
        array = new ArrayList<>();
    }

    CountingElements(ArrayList<Integer> arr) {
        array = arr;
    }

    public void setArray(ArrayList<Integer> array) {
        this.array = array;
    }

    public ArrayList<Integer> getArray() {
        return array;
    }

    public Map<Integer, Integer> countElements() {
        for (Integer i : array) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }
        return map;
    }

}
