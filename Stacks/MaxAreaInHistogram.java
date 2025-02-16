import java.util.*;

//O(n) time complexity
public class MaxAreaInHistogram {
    public static void maxArea(int arr[]) {
        int maxArea = 0;
        int nsr[] = new int[arr.length]; // next smaller right
        int nsl[] = new int[arr.length]; // next smaller left
        // next smaller left
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = st.peek();
            }
            st.push(i);
        }
        // next smaller right
        st = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = st.peek();
            }
            st.push(i);
        }
        // Current Area -> width = j-i-1, height = arr[i]
        for (int i = 0; i < arr.length; i++) {
            int width = nsr[i] - nsl[i] - 1;
            int currArea = width * arr[i];
            maxArea = Math.max(maxArea, currArea);
        }
        System.out.println(maxArea);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3 }; // heights in histogram
        maxArea(arr);
    }
}
