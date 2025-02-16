// public class Solution {
// // public static boolean repeatArrayElements(int arr[]) {
// // for (int i = 0; i < arr.length; i++) {
// // for (int j = i + 1; j < arr.length; j++) {
// // if (arr[i] == arr[j]) {
// // return true;
// // }
// // }
// // }
// // return false;
// // }

// // public static void maxProfit(int arr[]) {
// // int buyPrice = Integer.MAX_VALUE;
// // int maxProfit = 0;
// // for (int i = 0; i < arr.length; i++) {
// // if (buyPrice > arr[i]) {
// // buyPrice = arr[i];
// // } else {
// // maxProfit = Math.max(maxProfit, arr[i] - buyPrice);
// // }
// // }
// // System.out.println(maxProfit);
// // }

// // public static void trappedWater(int arr[]) {
// // int leftMax[] = new int[arr.length];
// // int rightMax[] = new int[arr.length];

// // leftMax[0] = arr[0];
// // for (int i = 1; i < arr.length; i++) {
// // leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
// // }

// // rightMax[arr.length - 1] = arr[arr.length - 1];
// // for (int i = arr.length - 2; i >= 0; i--) {
// // rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
// // }

// // int trappedWater = 0;
// // for (int i = 0; i < arr.length; i++) {
// // trappedWater += Math.min(leftMax[i], rightMax[i]) - arr[i];
// // }

// // System.out.println(trappedWater);
// // }

// public static void triplets(int arr[]) {
// for (int i = 0; i < arr.length - 2; i++) {
// for (int j = 1; j < arr.length - 1; j++) {
// for (int k = 2; k < arr.length; k++) {
// if (arr[i] + arr[j] + arr[k] == 0) {
// System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
// }
// }
// }
// }
// }

// public static void main(String[] args) {
// int arr[] = { -1, 0, 1, 2, -1, -4 };
// // System.out.println(repeatArrayElements(arr));
// // maxProfit(arr);
// // trappedWater(arr);
// triplets(arr);
// }
// }

// ----------------------------------------------------------------------------
// public class HomeWork {
// public static void printArr(int arr[]) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// System.out.println();
// }

// public static void bubbleSort(int arr[]) {
// for (int i = 0; i < arr.length - 1; i++) {
// for (int j = 0; j < arr.length - 1 - i; j++) {
// if (arr[j] < arr[j + 1]) {
// int temp = arr[j];
// arr[j] = arr[j + 1];
// arr[j + 1] = temp;
// }
// }
// }
// }

// public static void selectionSort(int arr[]) {
// for (int i = 0; i < arr.length - 1; i++) {
// int minPos = i;
// for (int j = i + 1; j < arr.length; j++) {
// if (arr[minPos] < arr[j]) {
// minPos = j;
// }
// }
// int temp = arr[minPos];
// arr[minPos] = arr[i];
// arr[i] = temp;
// }
// }

// public static void insertionSort(int arr[]) {
// for (int i = 1; i < arr.length; i++) {
// int curr = arr[i];
// int prev = i - 1;
// while (prev >= 0 && arr[prev] < curr) {
// arr[prev + 1] = arr[prev];
// prev--;
// }
// arr[prev + 1] = curr;
// }
// }

// public static void countingSort(int arr[]) {
// int max = Integer.MIN_VALUE;
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] > max) {
// max = arr[i];
// }
// }

// int count[] = new int[max + 1];
// for (int i = 0; i < arr.length; i++) {
// count[arr[i]]++;
// }

// int j = 0;
// for (int i = count.length - 1; i >= 0; i--) {
// while (count[i] > 0) {
// arr[j] = i;
// j++;
// count[i]--;
// }
// }
// }

// public static void main(String[] args) {
// int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
// printArr(arr);
// bubbleSort(arr);
// printArr(arr);
// selectionSort(arr);
// printArr(arr);
// insertionSort(arr);
// printArr(arr);
// countingSort(arr);
// printArr(arr);
// }
// }
// ----------------------------------------------------------------------------
// public class HomeWork {
// public static void count(int arr[][], int key) {
// int count = 0;
// for (int i = 0; i < arr.length; i++) {
// for (int j = 0; j < arr[i].length; j++) {
// if (arr[i][j] == key) {
// count++;
// }
// }
// }
// System.out.println(count);
// }

// public static void sum(int arr[][], int key) {
// int sum = 0;
// for (int i = 0; i < arr[key].length; i++) {
// sum += arr[key][i];
// }
// System.out.println(sum);
// }

// public static void transpose(int arr[][]) {
// int transpose[][] = new int[arr[0].length][arr.length];
// for (int i = 0; i < arr.length; i++) {
// for (int j = 0; j < arr[i].length; j++) {
// transpose[j][i] = arr[i][j];
// }
// }
// printArr(transpose);
// }

// public static void printArr(int arr[][]) {
// for (int i = 0; i < arr.length; i++) {
// for (int j = 0; j < arr[i].length; j++) {
// System.out.print(arr[i][j] + " ");
// }
// System.out.println();
// }
// }

// public static void main(String[] args) {
// int arr[][] = { { 4, 7, 8 }, { 11, 4, 3 } };
// count(arr, 7);
// sum(arr, 1);
// printArr(arr);
// transpose(arr);
// }
// }
// --------------------------------------------------------------------------------
// import java.util.Arrays;

// public class HomeWork {
// public static void countLowerVowels(String str) {
// int count = 0;
// for (int i = 0; i < str.length(); i++) {
// char ch = str.charAt(i);
// if (ch >= 'a' && ch <= 'z') {
// if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
// count++;
// }
// }
// }
// System.out.println(count);
// }

// public static void isAnagram(String str1, String str2) {
// str1 = str1.toLowerCase();
// str2 = str2.toLowerCase();
// if (str1.length() == str2.length()) {
// char[] str1Arr = str1.toCharArray(); // [l, i, s, t, e, n]
// char[] str2Arr = str2.toCharArray(); // [s, i, l, e, n, t]
// Arrays.sort(str1Arr); // [e, i, l, n, s, t]
// Arrays.sort(str2Arr); // [e, i, l, n, s, t]
// if (Arrays.equals(str1Arr, str2Arr)) {
// System.out.println("Anagram");
// } else {
// System.out.println("Not Anagram");
// }
// } else {
// System.out.println("Not Anagram");
// }

// }

// public static void main(String[] args) {
// // countLowerVowels("Hello World");
// isAnagram("care", "race");
// }
// }
// --------------------------------------------------------------------------------
// public class HomeWork {
// public static void main(String[] args) {
// // Swap two numbers without using a third variable , instead use bitwise
// operators
// int a = -5;
// int b = 10;
// System.out.println("Before Swapping : a = " + a + " b = " + b);
// a = a ^ b;
// b = a ^ b;
// a = a ^ b;
// System.out.println("After Swapping : a = " + a + " b = " + b);
// }
// }
// --------------------------------------------------------------------------------
// public class HomeWork {
// public static void main(String[] args) {
// Add 1 to a number without using arithmetic operators , instead use bitwise
// operators
// int x = 6;
// System.out.println(x + " + " + 1 + " is " + -~x);
// x = -4;
// System.out.println(x + " - " + 1 + " is " + ~-x);
// x = 0;
// System.out.println(x + " + " + 1 + " is " + -~x);
// }
// }
// --------------------------------------------------------------------------------
// public class HomeWork {
// public static void main(String[] args) {
// // Convert uppercase characters to lowercase using bitwise operators
// for (char ch = 'A'; ch <= 'Z'; ch++) {
// System.out.println(ch + " : " + (char) (ch | ' ')); // how it works : 'A' =
// 01000001 , 'a' = 01100001 , ' '
// // = 00100000
// }
// }
// }
// --------------------------------------------------------------------------------
// class Complex {
// int r;
// int i;

// Complex(int r, int i) {
// this.r = r;
// this.i = i;
// }

// public Complex add(Complex c1, Complex c2) {
// return new Complex(c1.r + c2.r, c1.i + c2.i);
// }

// public Complex sub(Complex c1, Complex c2) {
// return new Complex(c1.r - c2.r, c1.i - c2.i);
// }

// public Complex mul(Complex c1, Complex c2) {
// return new Complex(c1.r * c2.r - c1.i * c2.i, c1.r * c2.i + c1.i * c2.r);
// }

// public void print() {
// if (r == 0 && i == 0) {
// System.out.println(0);
// } else if (r == 0 && i != 0) {
// System.out.println(i + "i");
// } else if (r != 0 && i == 0) {
// System.out.println(r);
// } else {
// System.out.println(r + " + " + i + "i");
// }
// }
// }

// public class HomeWork {
// public static void main(String[] args) {
// Complex c1 = new Complex(3, 4);
// Complex c2 = new Complex(5, 6);
// Complex c3 = new Complex(0, 0);
// c3 = c3.add(c1, c2);
// c3.print();
// c3 = c3.sub(c1, c2);
// c3.print();
// c3 = c3.mul(c1, c2);
// c3.print();
// }
// }
// --------------------------------------------------------------------------------
// -------------------------------Recursion-Based-Khopdi-Sawaal--------------------
// --------------------------------------------------------------------------------
// public class HomeWork {
// public static void count(int arr[], int key, int idx) {
// if (idx == arr.length) {
// return;
// }
// if (arr[idx] == key) {
// System.out.print(idx + " ");
// }
// count(arr, key, idx + 1);
// }

// public static void toStr(int num) {
// String arr[] = { "zero", "one", "two", "three", "four", "five", "six",
// "seven", "eight", "nine" };
// if (num == 0) {
// return;
// }
// toStr(num / 10);
// System.out.print(arr[num % 10] + " ");
// }

// public static int length(String str) {
// if (str.length() == 0) {
// return 0;
// } else {
// return length(str.substring(1)) + 1;
// }

// }

// public static int countSubstrs(String str, int i, int j, int n) {
// if (n == 1) {
// return 1;
// }
// if (n == 0) {
// return 0;
// }
// int res = countSubstrs(str, i + 1, j, n - 1) + countSubstrs(str, i, j - 1, n
// - 1)
// - countSubstrs(str, i + 1, j - 1, n - 2);
// if (str.charAt(i) == str.charAt(j)) {
// res++;
// }
// return res;
// }

// // Tower of Hanoi - Super Important Recursion Problem (Khopdi Sawaal)
// public static void towerOfHanoi(int n, String src, String helper, String
// dest) {
// if (n == 1) {
// System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
// return;
// }
// // Transfer top n-1 disks from src to helper using dest
// towerOfHanoi(n - 1, src, dest, helper);
// // Transfer the nth disk from src to dest
// System.out.println("Transfer disk " + n + " from " + src + " to " + helper);
// // Transfer top n-1 disks from helper to dest using src
// towerOfHanoi(n - 1, helper, src, dest);
// }

// public static void main(String[] args) {
// int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
// int key = 2;
// count(arr, key, 0);
// System.out.println();
// int num = 1947;
// toStr(num);
// System.out.println();
// String str = "abcab";
// System.out.println(length(str));
// int n = str.length();
// System.out.println(countSubstrs(str, 0, n - 1, n));
// int disks = 3;
// towerOfHanoi(disks, "A", "B", "C");
// }
// }
// --------------------------------------------------------------------------------
// --------------------Divide-and-Conquer-Based-Khopdi-Sawaal----------------------
// --------------------------------------------------------------------------------
// public class HomeWork {
//     public static void mergeSort(String arr[], int si, int ei) {
//         if (si >= ei) {
//             return;
//         }
//         int mid = si + (ei - si) / 2;
//         mergeSort(arr, si, mid);
//         mergeSort(arr, mid + 1, ei);
//         merge(arr, si, mid, ei);
//     }

//     public static void merge(String arr[], int si, int mid, int ei) {
//         String temp[] = new String[ei - si + 1];
//         int i = si, j = mid + 1, k = 0;
//         while (i <= mid && j <= ei) {
//             if (arr[i].compareTo(arr[j]) > 0) {
//                 temp[k] = arr[j];
//                 j++;
//             } else {
//                 temp[k] = arr[i];
//                 i++;
//             }
//             k++;
//         }
//         while (i <= mid) {
//             temp[k] = arr[i];
//             i++;
//             k++;
//         }
//         while (j <= ei) {
//             temp[k] = arr[j];
//             j++;
//             k++;
//         }
//         for (k = 0, i = si; k < temp.length; k++, i++) {
//             arr[i] = temp[k];
//         }
//     }

//     public static void main(String[] args) {
//         String arr[] = { "sun", "earth", "mars", "mercury" };
//         mergeSort(arr, 0, arr.length - 1);
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
public class HomeWork {
    public static int majorityElement(int arr[]) {
        int majorityCount = 0;
        int majorityElement = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > majorityCount) {
                majorityCount = count;
                majorityElement = arr[i];
            }
        }
        return majorityElement;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElement(arr));
    }
}