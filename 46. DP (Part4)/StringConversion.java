public class StringConversion {

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

    public static int stringConversion(String str1, String str2) {
        int lcs = lcsTabulation(str1, str2);
        int totalDeleteOperations = str1.length() - lcs;
        int totalAddOperations = str2.length() - lcs;
        int ways = totalDeleteOperations + totalAddOperations;
        return ways;
    }

    public static void main(String[] args) {
        String str1 = "pear";
        String str2 = "sea";
        System.out.println(stringConversion(str1, str2));
    }
}
