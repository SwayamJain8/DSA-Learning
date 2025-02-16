import java.util.TreeMap;

public class TreeMapDS {
    public static void main(String[] args) {
        // TreeMap is a sorted map based on the keys
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("USA", 20);
        tm.put("UK", 300);
        tm.put("China", 4);

        System.out.println(tm);
    }
}
