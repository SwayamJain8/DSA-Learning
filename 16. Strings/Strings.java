
// Strings in Java are immutable. Once a string is created, it cannot be changed.
// import java.util.*;

public class Strings {
    /*
     * public static void printLetters(String str) {
     * for (int i = 0; i < str.length(); i++) {
     * System.out.println(str.charAt(i));
     * }
     * System.out.println();
     * }
     */
    /*
     * public static boolean isPalindrome(String str) {
     * for (int i = 0; i <= str.length() / 2; i++) {
     * if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
     * return false;
     * }
     * }
     * return true;
     * }
     */
    /*
     * public static float getShortestPath(String path) {
     * int x = 0, y = 0;
     * for (int i = 0; i < path.length(); i++) {
     * if (path.charAt(i) == 'N') {
     * y++;
     * } else if (path.charAt(i) == 'S') {
     * y--;
     * } else if (path.charAt(i) == 'E') {
     * x++;
     * } else if (path.charAt(i) == 'W') {
     * x--;
     * }
     * }
     * return (float) Math.sqrt(x * x + y * y);
     * }
     */

    /*
     * public static String subString(String str, int si, int ei) {
     * String subStr = "";
     * for (int i = si; i < ei; i++) {
     * subStr += str.charAt(i);
     * }
     * return subStr;
     * }
     */

    public static void main(String[] args) {
        // char arr[] = { 'a', 'b', 'c', 'd' };
        // String str = "abcd";
        // String str2 = new String("xyz");

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        // String fullName = "John Doe";
        // System.out.println(fullName.length());

        // String firstName = "John";
        // String lastName = "Doe";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName);
        // System.out.println(fullName.charAt(2));"

        // String str = "racaar";
        // if (isPalindrome(str)) {
        // System.out.println("Palindrome");
        // } else {
        // System.out.println("Not Palindrome");
        // }

        // String path = "WNEENESENNN";
        // System.out.println(getShortestPath(path));

        /*
         * String s1 = "Hello";
         * String s2 = "Hello";
         * String s3 = new String("Hello");
         * System.out.println(s1 == s2); // true
         * System.out.println(s1 == s3); // false
         * System.out.println(s1.equals(s3)); // true
         */

        /*
         * String str = "Hello World";
         * System.out.println(subString(str, 2, 7)); // User defined substring method
         * System.out.println(str.substring(2, 7)); // Inbuilt substring method
         */

        String fruits[] = { "Apple", "Banana", "Mango", "Orange" };

        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareToIgnoreCase(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
