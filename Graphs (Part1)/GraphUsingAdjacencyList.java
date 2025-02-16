import java.util.ArrayList;

class GraphUsingAdjacencyList {

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

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Create a array of size equal to number of vertices
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V]; // Array of ArrayList -> initially all elements are null

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges -> (src, dest, wt)
        // 0 - vertex
        graph[0].add(new Edge(0, 1, 5));
        // 1 - vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));
        // 2 - vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 4));
        // 3 - vertex
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));
        // 4 - vertex
        graph[4].add(new Edge(4, 2, 2));

        // 2's neighbours
        for (Edge edge : graph[2]) {
            System.out.println(edge.dest);
        }

    }
}