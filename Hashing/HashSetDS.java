import java.util.HashSet;
import java.util.Iterator;

public class HashSetDS {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);
        set.add(1);

        System.out.println(set);

        System.out.println(set.contains(2));

        set.remove(2);

        System.out.println(set);

        System.out.println(set.contains(2));

        System.out.println(set.size());

        set.clear();

        System.out.println(set.isEmpty());

        // Iterators
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bangalore");
        cities.add("Chennai");

        Iterator<String> it = cities.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for (String s : cities) {
            System.out.println(s);
        }

    }
}
