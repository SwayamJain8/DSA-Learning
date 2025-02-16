import java.util.*;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int W = 50;

        double ratio[][] = new double[val.length][2];
        // 0th col -> idx; 1st col -> ratio

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (double) val[i] / weight[i];
        }

        // Ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(a -> a[1]));

        int capacity = W;
        int finalVal = 0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) { // Include full item
                finalVal += val[idx];
                capacity -= weight[idx];
            } else {
                finalVal += (int) (capacity * ratio[i][1]); // Include fraction of item
                capacity = 0; // Knapsack full now
                break;
            }
        }

        System.out.println("Final Val : " + finalVal);
    }
}
