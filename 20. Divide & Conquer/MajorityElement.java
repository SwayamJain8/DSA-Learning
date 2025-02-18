// ( n / 2 )

public class MajorityElement {

    public static int majorityElement(int arr[], int si, int ei) {
        if (si == ei) {
            return arr[si];
        }
        int mid = si + (ei - si) / 2;
        int left = majorityElement(arr, si, mid);
        int right = majorityElement(arr, mid + 1, ei);
        if (left == right)
            return left;
        int leftCount = count(arr, left, si, ei);
        int rightCount = count(arr, right, si, ei);
        return leftCount > rightCount ? left : right;
    }

    public static int count(int arr[], int num, int si, int ei) {
        int count = 0;
        for (int i = si; i <= ei; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElement(arr, 0, arr.length - 1));
    }
}
