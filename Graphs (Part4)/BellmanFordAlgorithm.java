import java.util.ArrayList;

// Doesn't work for negative weighted cycles
public class BellmanFordAlgorithm {
    static class Edge {
        int src, dest, weight;

        public Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    };

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < 5; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));
    }

    static void createGraph2(ArrayList<Edge> graph) {
        graph.add(new Edge(0, 1, 2));
        graph.add(new Edge(0, 2, 4));

        graph.add(new Edge(1, 2, -4));

        graph.add(new Edge(2, 3, 2));

        graph.add(new Edge(3, 4, 4));

        graph.add(new Edge(4, 1, -1));
    }

    public static void bellmanFord(ArrayList<Edge> graph[], int src) {
        int dist[] = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[src] = 0;
        int V = graph.length;
        // Total time complexity of Bellman Ford - O(V*E)
        // algorithm - O(V)
        for (int i = 0; i < V - 1; i++) {
            // edges - O(E)
            for (int j = 0; j < V; j++) {
                for (int k = 0; k < graph[j].size(); k++) {
                    Edge e = graph[j].get(k);
                    // u, v, wt
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.weight;
                    // relaxation
                    if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                        dist[v] = dist[u] + wt;
                    }
                }
            }
        }
        // print
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
    }

    public static void bellmanFord2(ArrayList<Edge> graph, int src, int V) {
        int dist[] = new int[V];
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[src] = 0;
        // Total time complexity of Bellman Ford - O(V*E)
        for (int i = 0; i < V - 1; i++) {
            for (int k = 0; k < graph.size(); k++) {
                Edge e = graph.get(k);
                // u, v, wt
                int u = e.src;
                int v = e.dest;
                int wt = e.weight;
                // relaxation
                if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                    dist[v] = dist[u] + wt;
                }
            }
        }

        // print
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
    }

    // @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 5;
        // ArrayList<Edge> graph[] = new ArrayList[V];
        ArrayList<Edge> graph = new ArrayList<>();
        // createGraph(graph);
        createGraph2(graph);
        // bellmanFord(graph, 0);
        bellmanFord2(graph, 0, V);
    }
}