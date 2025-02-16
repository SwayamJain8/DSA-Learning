public class Binary {
    public static void oddOrEven(int num) {
        if ((num & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearLastIBits(int n, int i) {
        int bitMask = (-1 << i); // (~0 << i)
        return n & bitMask;
    }

    // Khopdi Sawal
    public static int clearRangeOfBits(int n, int i, int j) {
        int a = ~0 << (j + 1);
        int b = (1 << i) - 1; // 1 * 2^i - 1
        int bitMask = a | b;
        return bitMask & n;
    }

    // Khopdi Sawal - Har 2 ki power ke number me MSB 1 hota hai aur baki sab 0 ,
    // aur n-1 me MSB 0 hota hai aur baki sab 1 , toh un dono ka AND 0 hoga
    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    // Kisi bhi number ko binary me batane ke liye maximum log2(n)+1 bits chahiye
    // Khopdi Sawal
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    // Khopdi Sawal
    // Fast Exponentiation
    // Time Complexity : O(log(n))
    public static int fastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    // Modulo Exponentiation (Self)
    // Time Complexity : O(log(n))
    public static int modExpo(int a, int n, int mod) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                ans = (ans * a) % mod;
            }
            a = (a * a) % mod;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        oddOrEven(55);
        oddOrEven(66);
        System.out.println(getIthBit(5, 2));
        System.out.println(getIthBit(10, 2));
        System.out.println(setIthBit(5, 1));
        System.out.println(clearIthBit(5, 2));
        System.out.println(clearIthBit(10, 3));
        System.out.println(clearLastIBits(15, 2));
        System.out.println(clearLastIBits(15, 3));
        System.out.println(clearRangeOfBits(31, 1, 3));
        System.out.println(clearRangeOfBits(31, 2, 4));
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(15));
        System.out.println(countSetBits(15));
        System.out.println(countSetBits(16));
        System.out.println(fastExpo(2, 5));
        System.out.println(fastExpo(3, 4));
        System.out.println(modExpo(2, 5, 1000000007));
    }
}