import java.util.ArrayList;

public class PairSum2 {
    public static boolean pairSum2(ArrayList<Integer> arr, int target) {
        int bp = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > arr.get(i + 1)) {
                bp = i;
                break;
            }
        }
        int lp = bp + 1; // smallest
        int rp = bp; // largest

        while (lp != rp) {
            if (arr.get(lp) + arr.get(rp) == target) {
                return true;
            } else if (arr.get(lp) + arr.get(rp) < target) {
                lp = (lp + 1) % arr.size();
            } else {
                rp = (rp - 1 + arr.size()) % arr.size();
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(11);
        arr.add(15);
        arr.add(6);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        int target = 16;
        System.out.println(pairSum2(arr, target));
    }
}
