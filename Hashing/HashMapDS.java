import java.util.HashMap;
import java.util.Set;

public class HashMapDS {
    public static void main(String[] args) {
        // Create
        HashMap<String, Integer> hm = new HashMap<>();

        // // Insert - O(1)
        // hm.put("India", 100);
        // hm.put("China", 150);
        // hm.put("USA", 50);
        // System.out.println(hm);

        // // Get - O(1)
        // int population = hm.get("India");
        // System.out.println(population);
        // System.out.println(hm.get("Indonesia")); // null

        // // ContainsKey - O(1)
        // System.out.println(hm.containsKey("India")); // true
        // System.out.println(hm.containsKey("Indonesia")); // false

        // // Remove - O(1)
        // System.out.println(hm.remove("China"));
        // System.out.println(hm.remove("Indonesia")); // null
        // System.out.println(hm);

        // // Size - O(1)
        // System.out.println(hm.size());

        // // IsEmpty - O(1)
        // System.out.println(hm.isEmpty());

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Indonesia", 6);
        hm.put("Nepal", 5);

        // Iterate
        // hm.entrySet() can also be used but it sto
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String key : keys) {
            System.out.println(key + " : " + hm.get(key));
        }

    }
}