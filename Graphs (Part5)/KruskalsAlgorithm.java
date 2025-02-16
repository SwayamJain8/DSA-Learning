import java.util.ArrayList;
import java.util.Collections;

public class KruskalsAlgorithm {

    static class Edge implements Comparable<Edge> {
        int src, dest, weight;

        public Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge e2) {
            return this.weight - e2.weight;
        }
    }

    static void createGraph(ArrayList<Edge> edges) {
        // edges
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(0, 3, 30));
        edges.add(new Edge(1, 3, 40));
        edges.add(new Edge(2, 3, 50));
    }

    static int n = 4; // vertices
    static int parent[] = new int[n];
    static int rank[] = new int[n];

    public static void init() {
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    public static int find(int x) {
        if (parent[x] == x)
            return x;
        return parent[x] = find(parent[x]);
    }

    public static void union(int a, int b) {
        int parA = find(a);
        int parB = find(b);

        if (rank[parA] < rank[parB]) {
            parent[parA] = parB;
        } else if (rank[parA] > rank[parB]) {
            parent[parB] = parA;
        } else {
            parent[parB] = parA;
            rank[parA]++;
        }
    }

    public static void kruskalsMST(ArrayList<Edge> edges, int V) {
        init();
        Collections.sort(edges); // O(ElogE)
        int mstCost = 0;
        int count = 0;

        for (int i = 0; count < V - 1; i++) { // (V)
            Edge e = edges.get(i);
            int parA = find(e.src);
            int parB = find(e.dest);
            if (parA != parB) {
                union(e.src, e.dest);
                mstCost += e.weight;
                count++;
            }
        }
        System.out.println(mstCost);

    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> edges = new ArrayList<>();
        createGraph(edges);
        kruskalsMST(edges, V);
    }
}
