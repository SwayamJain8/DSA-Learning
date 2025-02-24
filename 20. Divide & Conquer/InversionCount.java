public class InversionCount {

    public static int mergeSort(int arr[], int si, int ei) {

        int invCount = 0;

        if (ei > si) {
            int mid = si + (ei - si) / 2; // to avoid overflow // (si + ei) / 2
            invCount = mergeSort(arr, si, mid); // left half
            invCount += mergeSort(arr, mid + 1, ei); // right half
            invCount += merge(arr, si, mid, ei);
        }
        return invCount;
    }

    public static int merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si, j = mid + 1, k = 0;
        int invCount = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
                invCount += (mid - i + 1); // count of inversions
            }
            k++;
        }

        // leftover elements
        // left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // right half
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        // copy temp to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
        return invCount;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 3, 5 };
        System.out.println(mergeSort(arr, 0, arr.length - 1));
    }
}
