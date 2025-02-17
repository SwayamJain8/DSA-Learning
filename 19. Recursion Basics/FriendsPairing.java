// Khopdi Sawaal: Friends Pairing Problem

public class FriendsPairing {

    public static int friendsPairing(int n) {

        if (n == 0 || n == 1 || n == 2)
            return n;

        // choice
        // single
        int singleWays = friendsPairing(n - 1);

        // pair
        int pairWays = (n - 1) * friendsPairing(n - 2);

        // total ways
        return singleWays + pairWays;
    }

    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }
}
