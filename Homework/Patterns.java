// public class Patterns {
// public static void main(String[] args) {
// for (int i = 1; i <= 4; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// for (int j = 1; j <= 2 * (4 - i); j++) {
// System.out.print(" ");
// }
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// for (int i = 4; i >= 1; i--) {
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// for (int j = 1; j <= 2 * (4 - i); j++) {
// System.out.print(" ");
// }
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// System.out.println();
// }

// }
// }
// ---------------------------------------------------------------------------
// public class Patterns {
// public static void main(String[] args) {
// for (int i = 1; i <= 5; i++) {
// for (int j = 1; j <= 5 - i; j++) {
// System.out.print(" ");
// }
// for (int j = 1; j <= 5; j++) {
// if (j == 1 || j == 5 || i == 1 || i == 5) {
// System.out.print("*");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }
// }
// ---------------------------------------------------------------------------
// public class Patterns {
// public static void main(String[] args) {
// for (int i = 1; i <= 4; i++) {
// for (int j = 1; j <= 4 - i; j++) {
// System.out.print(" ");
// }
// for (int j = 1; j <= 2 * i - 1; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// for (int i = 4; i >= 1; i--) {
// for (int j = 1; j <= 4 - i; j++) {
// System.out.print(" ");
// }
// for (int j = 1; j <= 2 * i - 1; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }
// }
//---------------------------------------------------------------------------
public class Patterns {
    public static void palindrome(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        palindrome(5);
    }
}