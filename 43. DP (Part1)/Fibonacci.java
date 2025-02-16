public class Fibonacci {
    public static int fibMemoization(int n, int f[]) { // O(n)
        if (n == 0 || n == 1) {
            return n;
        } else {
            if (f[n] != 0) {
                return f[n];
            }
            return f[n] = fibMemoization(n - 1, f) + fibMemoization(n - 2, f);
        }
    }

    public static int fibTabulation(int n) { // O(n)
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int f[] = new int[n + 1]; // memoization
        System.out.println(fibMemoization(n, f));
        System.out.println(fibTabulation(n));
    }
}