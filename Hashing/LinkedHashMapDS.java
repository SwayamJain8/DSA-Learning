import java.util.LinkedHashMap;

public class LinkedHashMapDS {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        // LinkedHashMap maintains the order of insertion
        lhm.put("India", 135);
        lhm.put("China", 200);
        lhm.put("USA", 100);
        lhm.put("Canada", 50);

        System.out.println(lhm);

    }
}
