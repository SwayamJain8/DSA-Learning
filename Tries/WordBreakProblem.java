public class WordBreakProblem {

    static class Node {
        Node children[] = new Node[26];
        boolean isEndOfWord;

        public Node() {
            isEndOfWord = false;
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            }
            curr = curr.children[index];
        }
        curr.isEndOfWord = true;
    }

    public static boolean search(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (curr.children[index] == null) {
                return false;
            }
            curr = curr.children[index];
        }
        return curr != null && curr.isEndOfWord;
    }

    public static boolean wordBreak(String key) { // O(L)
        if (key.length() == 0) {
            return true;
        }
        for (int i = 1; i <= key.length(); i++) {
            if (search(key.substring(0, i)) && wordBreak(key.substring(i))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String arr[] = { "i", "like", "sam", "sung", "samsung", "mobile", "ice" };
        for (String word : arr) {
            insert(word);
        }
        String key = "ilikesamsung";
        System.out.println(wordBreak(key));
    }
}
