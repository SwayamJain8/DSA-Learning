import java.util.ArrayList;

public class CycleDetectionInDirectedGraph {
    static class Edge {
        int src, dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 0));
    }

    public static boolean isCycle(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (isCycleUtil(graph, i, vis, stack)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge> graph[], int curr, boolean vis[], boolean stack[]) {
        vis[curr] = true;
        stack[curr] = true;

        for (Edge edge : graph[curr]) {
            if (!vis[edge.dest]) {
                if (isCycleUtil(graph, edge.dest, vis, stack)) {
                    return true;
                }
            } else if (stack[edge.dest]) {
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(isCycle(graph));
    }
}
