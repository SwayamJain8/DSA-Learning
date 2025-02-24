public class CountPalindromeSubstr {

    public static int countSubstrs(String str, int start, int end, int n) {
        if (n == 1)
            return 1;
        if (n <= 0)
            return 0;

        int res = countSubstrs(str, start + 1, end, n - 1)
                + countSubstrs(str, start, end - 1, n - 1)
                - countSubstrs(str, start + 1, end - 1, n - 2);

        if (str.charAt(start) == str.charAt(end)) {
            res++;
        }

        return res;
    }

    public static void main(String[] args) {
        String str = "abcab";
        int n = str.length();
        System.out.println(countSubstrs(str, 0, n - 1, n));
    }
}
