public class WildcardMatching {

    public static boolean isMatch(String s, String p) { // O(n*m)
        int n = s.length();
        int m = p.length();
        boolean[][] dp = new boolean[n + 1][m + 1];
        // initialize
        dp[0][0] = true;
        // pattern = " "
        for (int i = 1; i <= n; i++) {
            dp[i][0] = false;
        }
        // string = " "
        for (int j = 1; j <= m; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            } else {
                dp[0][j] = false;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                } else {
                    dp[i][j] = false;
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        String s = "baaabab";
        String p = "*****b?*****ab";
        System.out.println(isMatch(s, p));
    }
}
