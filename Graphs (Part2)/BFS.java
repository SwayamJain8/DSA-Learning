import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));
    }

    // For Disconnected Graph
    public static void bfs(ArrayList<Edge>[] graph) { // O(V+E) , if Adjacency Matrix is used then O(V^2)
        boolean visited[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                bfsUtil(graph, visited);
            }
        }
    }

    public static void bfsUtil(ArrayList<Edge>[] graph, boolean visited[]) { // O(V+E) , if Adjacency Matrix is used
                                                                             // then O(V^2)
        Queue<Integer> q = new LinkedList<>();
        q.add(0); // starting vertex

        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!visited[curr]) {
                System.out.print(curr + " ");
                visited[curr] = true;
                for (Edge e : graph[curr]) {
                    q.add(e.dest);
                }
            }

        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        bfs(graph);
    }
}
