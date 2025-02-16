import java.util.Arrays;

public class MatrixChainMultiplication {

    public static int mcmRecursion(int arr[], int i, int j) {
        if (i == j) { // single matrix case
            return 0;
        }
        int minCost = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            int cost1 = mcmRecursion(arr, i, k); // Ai to Ak => arr[i-1] x arr[k]
            int cost2 = mcmRecursion(arr, k + 1, j); // Ak+1 to Aj => arr[k] x arr[j]
            int cost3 = arr[i - 1] * arr[k] * arr[j]; // arr[i-1] x arr[k] x arr[j]
            int finalCost = cost1 + cost2 + cost3;
            minCost = Math.min(minCost, finalCost);
        }
        return minCost;
    }

    public static int mcmMemoization(int arr[], int i, int j, int dp[][]) {
        if (i == j) { // single matrix case
            return dp[i][j] = 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int minCost = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            int cost1 = mcmMemoization(arr, i, k, dp); // Ai to Ak => arr[i-1] x arr[k]
            int cost2 = mcmMemoization(arr, k + 1, j, dp); // Ak+1 to Aj => arr[k] x arr[j]
            int cost3 = arr[i - 1] * arr[k] * arr[j]; // arr[i-1] x arr[k] x arr[j]
            int finalCost = cost1 + cost2 + cost3;
            minCost = Math.min(minCost, finalCost);
        }
        return dp[i][j] = minCost;
    }

    public static void print(int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int mcmTabulation(int arr[]) {
        int n = arr.length;
        int dp[][] = new int[n][n];
        // initialization
        for (int i = 0; i < n; i++) {
            dp[i][i] = 0;
        }
        // bottom up
        for (int len = 2; len <= n - 1; len++) { // len means chain length
            for (int i = 1; i <= n - len; i++) { // i means row
                int j = i + len - 1; // j means column
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k <= j - 1; k++) {
                    int cost1 = dp[i][k]; // Ai to Ak => arr[i-1] x arr[k]
                    int cost2 = dp[k + 1][j]; // Ak+1 to Aj => arr[k] x arr[j]
                    int cost3 = arr[i - 1] * arr[k] * arr[j]; // arr[i-1] x arr[k] x arr[j]
                    int finalCost = cost1 + cost2 + cost3;
                    dp[i][j] = Math.min(dp[i][j], finalCost);
                }
            }
        }
        print(dp);
        return dp[1][n - 1];
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 3 }; // 4 matrices
        int n = arr.length;
        System.out.println(mcmRecursion(arr, 1, n - 1));
        int dp[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(mcmMemoization(arr, 1, n - 1, dp));
        System.out.println(mcmTabulation(arr));
    }
}
