// // Bubble Sort
// public class BasicSorting {
// public static void bubbleSort(int arr[]) {
// for (int turn = 0; turn < arr.length - 1; turn++) { // Number of turns
// for (int j = 0; j < arr.length - 1 - turn; j++) { // Number of comparisons
// // Pushing the largest element to the end
// if (arr[j] > arr[j + 1]) {
// int temp = arr[j];
// arr[j] = arr[j + 1];
// arr[j + 1] = temp;
// }
// }
// }
// }
// }

// public static void printArr(int arr[]) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// System.out.println();
// }

// public static void main(String[] args) {
// int arr[] = { 5, 4, 1, 3, 2 };
// bubbleSort(arr);
// printArr(arr);
// }
// }

// -----------------------------
// Selction Sort
// -----------------------------
// public class BasicSorting {

// public static void selectionSort(int arr[]) {
// for (int i = 0; i < arr.length - 1; i++) {
// int minPos = i;
// for (int j = i + 1; j < arr.length; j++) {
// if (arr[minPos] > arr[j]) {
// minPos = j;
// }
// }
// int temp = arr[minPos];
// arr[minPos] = arr[i];
// arr[i] = temp;
// }
// }
// }

// public static void printArr(int arr[]) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// System.out.println();
// }

// public static void main(String[] args) {
// int arr[] = { 5, 4, 1, 3, 2 };
// selectionSort(arr);
// printArr(arr);
// }
// }
// -----------------------
// Insertion Sort
// -----------------------
// public class BasicSorting {

// public static void insertionSort(int arr[]) {
// for (int i = 1; i < arr.length; i++) {
// int curr = arr[i];
// int prev = i - 1;
// // finding out the correct position to insert
// while (prev >= 0 && arr[prev] > curr) {
// arr[prev + 1] = arr[prev];
// prev--;
// }
// // insertion
// arr[prev + 1] = curr;

// }
// }
// }

// public static void printArr(int arr[]) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// System.out.println();
// }

// public static void main(String[] args) {
// int arr[] = { 5, 4, 1, 3, 2 };
// insertionSort(arr);
// printArr(arr);
// }
// }
// ---------------------
// Inbuilt sort
// ---------------------
// import java.util.Arrays;
// import java.util.Collections;
// import java.util.*;

// public class BasicSorting {
// public static void main(String[] args) {
// Integer arr[] = { 5, 4, 1, 3, 2 };
// Arrays.sort(arr, 0, 3, Collections.reverseOrder());
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }
// }
// ----------------------------------
// Counting Sort
// ----------------------------------
public class BasicSorting {

    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int numbers[] = { 5, 4, 1, 3, 2, 1, 5, 2 };
        countingSort(numbers);
        printArr(numbers);

    }
}