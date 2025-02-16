import java.util.ArrayList;

public class ArrayListDemo {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        // Java Collection Framework
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> subList1 = new ArrayList<>();
        ArrayList<Integer> subList2 = new ArrayList<>();

        // Add
        list.add(1); // O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1, 10); // O(n)

        System.out.println(list);

        // Get
        int element = list.get(2); // O(1)
        System.out.println(element);

        // Remove
        list.remove(2); // O(n)
        System.out.println(list);

        // Set
        list.set(1, 5); // O(n)
        System.out.println(list);

        // Contains element
        System.out.println(list.contains(5)); // O(n)

        // Size
        System.out.println(list.size()); // O(1)

        // O(n)
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // O(n)
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println("Max: " + max);

        // Swap
        int idx1 = 1, idx2 = 3;
        System.out.println(list);
        swap(list, idx1, idx2);
        System.out.println(list);

        // 2D ArrayList
        subList1.add(1);
        subList1.add(2);
        mainList.add(subList1);
        subList2.add(3);
        subList2.add(4);
        mainList.add(subList2);

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

        System.out.println(mainList);

        // --------------------------------------------------
        ArrayList<ArrayList<Integer>> twoDList = new ArrayList<>();
        ArrayList<Integer> subList2D1 = new ArrayList<>();
        ArrayList<Integer> subList2D2 = new ArrayList<>();
        ArrayList<Integer> subList2D3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            subList2D1.add(1 * i);
            subList2D2.add(2 * i);
            subList2D3.add(3 * i);
        }
        twoDList.add(subList2D1);
        twoDList.add(subList2D2);
        twoDList.add(subList2D3);

        System.out.println(twoDList);

        for (int i = 0; i <= twoDList.size() - 1; i++) {
            ArrayList<Integer> currList = twoDList.get(i);
            for (int j = 0; j <= currList.size() - 1; j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
