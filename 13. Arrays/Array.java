
// MAX Subarray Sum

// Brute Force Technique
// -----------------------
// import java.util.*;

// public class Array {

//     public static void subArr(int num[]) {
//         int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
//         for (int i = 0; i < num.length; i++) {
//             for (int j = i; j < num.length; j++) {
//                 for (int k = i; k <= j; k++) {
//                     System.out.print(num[k] + " ");
//                     sum += num[k];
//                 }
//                 System.out.print(" => " + sum);

//                 if (sum < min) {
//                     min = sum;
//                 }

//                 if (sum > max) {
//                     max = sum;
//                 }

//                 sum = 0;
//                 System.out.println();
//             }

//             // min = Integer.MAX_VALUE;
//             // max = Integer.MIN_VALUE;
//             System.out.println();
//         }
//         System.out.println("Minimum sum: " + min);
//         System.out.println("Maximum sum: " + max);
//     }

//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.in);
//         int num[] = { 2, 4, 6, 8, 10, 12, -14 };

//         subArr(num);

//     }
// }
// ---------------------------
// Prifix Sum Technique
// ---------------------------
// public class Array {

// public static void maxVal(int arr[]) {
// int prefix[] = new int[arr.length];
// int max = Integer.MIN_VALUE;
// int sum = 0;
// prefix[0] = arr[0];
// for (int i = 1; i < arr.length; i++) {
// prefix[i] = arr[i] + prefix[i - 1];
// }
// for (int i = 0; i < arr.length; i++) {
// for (int j = i; j < arr.length; j++) {
// sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

// if (max < sum) {
// max = sum;
// }

// }
// }
// System.out.println("Maximum value: " + max);
// }

// public static void main(String[] args) {
// int arr[] = { 1, -2, 6, -1, 3 };

// maxVal(arr);

// }
// }

// ---------------------------
// Kadane's Algorithm
// ---------------------------
public class Array {

    public static void kadanes(int arr[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }

        if (count == arr.length) {
            for (int i = 0; i < arr.length; i++) {
                ms = Math.max(ms, arr[i]);
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                cs += arr[i];
                if (cs < 0) {
                    cs = 0;
                }
                ms = Math.max(cs, ms); // Max of cs and ms will be stored in ms
            }
        }

        System.out.println("Maximum sum: " + ms);
    }

    public static void main(String[] args) {
        int arr[] = { -4, -2, -5, -3 };
        kadanes(arr);
    }
}