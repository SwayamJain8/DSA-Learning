import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapImplementation {

    static class HashMap<K, V> { // generic
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> buckets[]; // N

        @SuppressWarnings("unchecked") // to remove the warning of unchecked LinkedList type
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4]; // this line means that we are creating an array of linked list of size 4
                                              // and each index will contain a linked list of nodes
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode(); // hash code
            return Math.abs(hc) % N; // to get the index of the bucket
        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBuck[] = buckets;
            N = 2 * N;
            buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

            // copy old data to new buckets
            for (int i = 0; i < oldBuck.length; i++) {
                LinkedList<Node> ll = oldBuck[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) { // O(lambda) -> O(1)
            int bi = hashFunction(key); // bucket index -> 0 to 3
            int di = searchInLL(key, bi); // data index -> vald / -1

            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) { // O(lambda) -> O(1)
            int bi = hashFunction(key); // bucket index -> 0 to 3
            int di = searchInLL(key, bi); // data index -> vald / -1

            if (di != -1) {
                return true;
            } else {
                return false;
            }
        }

        public V get(K key) { // O(lambda) -> O(1)
            int bi = hashFunction(key); // bucket index -> 0 to 3
            int di = searchInLL(key, bi); // data index -> vald / -1

            if (di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }

        public V remove(K key) { // O(lambda) -> O(1)
            int bi = hashFunction(key); // bucket index -> 0 to 3
            int di = searchInLL(key, bi); // data index -> vald / -1

            if (di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else {
                return null;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }

    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("USA", 200);
        hm.put("UK", 300);
        hm.put("Russia", 400);
        hm.put("China", 500);

        ArrayList<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        System.out.println(hm.get("India"));
        System.out.println(hm.remove("India"));
        System.out.println(hm.get("India"));

    }
}
