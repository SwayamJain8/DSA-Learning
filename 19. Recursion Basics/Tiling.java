// Rewise This Topic Again

// Khopdi sawal: 2 x n (floor size) ka tiling kitne tarike se ho sakta hai? 
// Aapko 2 x n ka floor diya gaya hai. Aapko usko 2 x 1 ya 1 x 2 tiles se fill karna hai.
// Aapko batana hai ki kitne tarike se aap usko fill kar sakte ho.

public class Tiling {

    public static int tilingProblem(int n) { // 2 x n (floor size)
        // base case
        if (n == 0 || n == 1)
            return 1;

        // kaam
        // vertical choice
        int fnm1 = tilingProblem(n - 1);

        // horizontal choice
        int fnm2 = tilingProblem(n - 2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(5));
    }
}
