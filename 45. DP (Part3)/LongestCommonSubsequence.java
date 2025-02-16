public class LongestCommonSubsequence {

    public static int lcsRecursion(String str1, String str2, int n, int m) {
        if (n == 0 || m == 0) {
            return 0;
        }
        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
            return lcsRecursion(str1, str2, n - 1, m - 1) + 1;
        } else {
            int ans1 = lcsRecursion(str1, str2, n - 1, m);
            int ans2 = lcsRecursion(str1, str2, n, m - 1);
            return Math.max(ans1, ans2);
        }
    }

    public static int lcsMemoization(String str1, String str2, int n, int m, int dp[][]) {
        if (n == 0 || m == 0) {
            return 0;
        }

        if (dp[n][m] != -1) {
            return dp[n][m];
        }

        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
            return dp[n][m] = lcsMemoization(str1, str2, n - 1, m - 1, dp) + 1;
        } else {
            int ans1 = lcsMemoization(str1, str2, n - 1, m, dp);
            int ans2 = lcsMemoization(str1, str2, n, m - 1, dp);
            return dp[n][m] = Math.max(ans1, ans2);
        }
    }

    public static int lcsTabulation(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        int dp[][] = new int[n + 1][m + 1];

        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }

        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[n][m];
    }

    public static void main(String[] args) {
        String str1 = "abcdge";
        String str2 = "abedg"; // lcs = 4 (abdg)
        int n = str1.length();
        int m = str2.length();
        System.out.println(lcsRecursion(str1, str2, n, m));

        int dp[][] = new int[n + 1][m + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(lcsMemoization(str1, str2, n, m, dp));

        System.out.println(lcsTabulation(str1, str2));
    }
}
