import java.util.ArrayList;

public class PairSum1 {
    // // Brute force - O(n^2)
    // public static boolean pairSum1(ArrayList<Integer> arr, int target) {
    // for (int i = 0; i < arr.size(); i++) {
    // for (int j = i + 1; j < arr.size(); j++) {
    // if (arr.get(i) + arr.get(j) == target) {
    // return true;
    // }
    // }
    // }
    // return false;
    // }

    // 2 pointer approach - O(n)
    public static boolean pairSum1(ArrayList<Integer> arr, int target) {
        int start = 0;
        int end = arr.size() - 1;
        while (start < end) {
            if (arr.get(start) + arr.get(end) == target) {
                return true;
            } else if (arr.get(start) + arr.get(end) < target) {
                start++;
            } else {
                end--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        int target = 5;
        System.out.println(pairSum1(arr, target));
    }
}
