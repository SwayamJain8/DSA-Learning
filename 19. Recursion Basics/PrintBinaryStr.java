// Khopdi Sawaal : Given a number n, print all binary strings of length n such that there are no consecutive 1's in the string.

public class PrintBinaryStr {

    public static void printBinStr(int n, int lastPlace, String str) {

        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // kaam
        printBinStr(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinStr(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        printBinStr(3, 0, "");
    }
}
