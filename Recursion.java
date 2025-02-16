public class Recursion {

    public static void printDec(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void printInc(int n) {
        if (n == 0)
            return;
        printInc(n - 1);
        System.out.print(n + " ");

    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        int fn = n * factorial(n - 1);
        return fn;
    }

    public static int sum(int n) {
        if (n == 0)
            return 0;
        int sn = n + sum(n - 1);
        return sn;
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] >= arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static int firstOccurence(int arr[], int key, int i) {
        if (i == arr.length - 1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i + 1);
    }

    public static int lastOccurence(int arr[], int key, int i) {
        if (i == -1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return lastOccurence(arr, key, i - 1);
    }

    public static int pow(int x, int n) {
        if (n == 0)
            return 1;
        return x * pow(x, n - 1);
    }

    public static int optimizedPow(int x, int n) {
        if (n == 0)
            return 1;
        int halfPow = optimizedPow(x, n / 2);
        int halfPowSq = halfPow * halfPow;
        if (n % 2 != 0) {
            halfPowSq = halfPowSq * x;
        }
        return halfPowSq;
    }

    public static void main(String[] args) {
        printDec(10);
        System.out.println();
        printInc(10);
        System.out.println();
        System.out.println(factorial(5));
        System.out.println(sum(100));
        System.out.println(fibonacci(10));
        int arr[] = { 5, 1, 7, 9 };
        System.out.println(isSorted(arr, 0));
        if (firstOccurence(arr, 10, 0) == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + firstOccurence(arr, 10, 0));
        }
        if (lastOccurence(arr, 5, arr.length - 1) == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + lastOccurence(arr, 5, arr.length - 1));
        }
        System.out.println(pow(2, 5));
        System.out.println(optimizedPow(2, 5));
    }
}
