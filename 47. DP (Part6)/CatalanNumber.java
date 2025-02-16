public class CatalanNumber {

    public static int catalanRecursion(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int ans = 0;
        for (int i = 0; i <= n - 1; i++) {
            ans += catalanRecursion(i) * catalanRecursion(n - i - 1);
        }
        return ans;
    }

    public static int catalanMemoization(int n, int dp[]) {
        if (n == 0 || n == 1) {
            return dp[n] = 1;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int ans = 0;
        for (int i = 0; i <= n - 1; i++) {
            ans += catalanMemoization(i, dp) * catalanMemoization(n - i - 1, dp);
        }
        return dp[n] = ans;
    }

    public static int catalanTabulation(int n) { // O(n^2)
        int dp[] = new int[n + 1];
        dp[0] = dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(catalanRecursion(n));
        int dp[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }
        System.out.println(catalanMemoization(n, dp));
        System.out.println(catalanTabulation(n));
    }
}
