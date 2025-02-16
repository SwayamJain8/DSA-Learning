import java.util.*;

public class StockSpan {
    public static void stockSpan(int stocks[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for (int i = 1; i < stocks.length; i++) {
            int currPrice = stocks[i];
            while (!s.isEmpty() && stocks[s.peek()] < currPrice) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh; // i - prevHigh is the number of days between the current day and the previous
                                        // high day
            }
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };
        int span[] = new int[stocks.length];
        stockSpan(stocks, span);

        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }
    }
}
