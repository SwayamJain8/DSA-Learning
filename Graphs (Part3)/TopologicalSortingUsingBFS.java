//Kahn's Algorithm

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSortingUsingBFS {
    static class Edge {
        int src, dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void calcInDegree(ArrayList<Edge> graph[], int inDegree[]) {
        for (int i = 0; i < graph.length; i++) {
            for (Edge edge : graph[i]) {
                inDegree[edge.dest]++;
            }
        }
    }

    public static void topSort(ArrayList<Edge> graph[]) {
        int inDegree[] = new int[graph.length];
        calcInDegree(graph, inDegree);
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] == 0) {
                q.add(i);
            }
        }

        // bfs
        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");

            for (Edge e : graph[curr]) {
                inDegree[e.dest]--;
                if (inDegree[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        topSort(graph);
    }
}
