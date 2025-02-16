import java.util.HashSet;

public class CountDistinctElements {
    public static void main(String[] args) {
        int num[] = { 4, 3, 4, 4, 4, 5, 5, 3, 2, 2, 2, 2, 2 };

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < num.length; i++) {
            set.add(num[i]);
        }

        System.out.println(set.size());
    }
}
