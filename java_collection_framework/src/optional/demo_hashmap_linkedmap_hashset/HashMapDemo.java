package optional.demo_hashmap_linkedmap_hashset;

import java.util.LinkedList;

public class HashMapDemo {
    LinkedList<String> keys = new LinkedList<>();
    LinkedList<Integer> values = new LinkedList<>();

    public void put(String key, int value) {
        if (keys.contains(key)) {
            values.set(keys.indexOf(key), value);
        } else {
            keys.add(key);
            values.add(value);
        }
    }

    public int size() {
        return this.values.size();
    }

    public void remove(String key) {
        int index = keys.indexOf(key);
        keys.remove(index);
        values.remove(index);
    }

    public void clear() {
        keys.clear();
        values.clear();
    }

    public int get(String key) throws InvalidIndexException {
        int index = keys.indexOf(key);
        if (index >=0)
            return values.get(index);
        else{
            System.out.println("Not find");
            return -1;
        }
    }

    public void print() {
        String display = "";
        for (int i = 0; i < keys.size(); i++) {
            display += " Key = " + keys.get(i) + " Value = " + values.get(i) + ";";
        }
        System.out.println(display);
    }

    public static void main(String[] args) throws InvalidIndexException {
        HashMapDemo hm = new HashMapDemo();

        hm.put("a", 3);
        hm.put("b", 5);
        hm.put("c", 4);
        hm.put("a", 6);
        hm.put("d", 8);
        hm.put("e", 9);
        hm.put("f", 1);
        hm.put("g", 2);

        hm.remove("g");
        System.out.println(hm.get("a"));
        //hm.clear();
        hm.print();
    }
}
