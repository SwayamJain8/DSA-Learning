// Fractional Knapsack -> Greedy Algorithm
// 0-1 Knapsack -> Dynamic Programming
// Unbounded Knapsack -> Dynamic Programming

public class ZeroOneKnapsack {

    public static int knapsackRecursion(int val[], int wt[], int W, int n) { // O(2^n)
        if (W == 0 || n == 0) {
            return 0;
        }

        if (wt[n - 1] <= W) { // valid
            // include
            int include = val[n - 1] + knapsackRecursion(val, wt, W - wt[n - 1], n - 1);
            // exclude
            int exclude = knapsackRecursion(val, wt, W, n - 1);

            return Math.max(include, exclude);
        } else { // invalid
            return knapsackRecursion(val, wt, W, n - 1);
        }
    }

    public static int knapsackMemoization(int val[], int wt[], int W, int n, int dp[][]) { // O(n*W)
        if (W == 0 || n == 0) {
            return 0;
        }

        if (dp[n][W] != -1) {
            return dp[n][W];
        }

        if (wt[n - 1] <= W) { // valid
            // include
            int include = val[n - 1] + knapsackRecursion(val, wt, W - wt[n - 1], n - 1);
            // exclude
            int exclude = knapsackRecursion(val, wt, W, n - 1);

            return dp[n][W] = Math.max(include, exclude);
        } else { // invalid
            return dp[n][W] = knapsackRecursion(val, wt, W, n - 1);
        }
    }

    public static void print(int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int knapsackTabulation(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                int v = val[i - 1];
                int w = wt[i - 1];
                if (w <= j) { // valid
                    int include = v + dp[i - 1][j - w];
                    int exclude = dp[i - 1][j];
                    dp[i][j] = Math.max(include, exclude);
                } else { // invalid
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        print(dp);
        return dp[n][W];
    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;
        int n = val.length;
        System.out.println(knapsackRecursion(val, wt, W, n));
        int dp[][] = new int[n + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(knapsackMemoization(val, wt, W, n, dp));
        System.out.println(knapsackTabulation(val, wt, W));
    }
}