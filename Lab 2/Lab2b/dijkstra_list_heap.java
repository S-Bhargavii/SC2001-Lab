public class dijkstra_list_heap {
    int INFINTY = 99999999;

    public void ShortestPath(AdjacencyListGraph graph, int source) {
        int d[] = new int[graph.V];
        int pi[] = new int[graph.V];
        boolean S[] = new boolean[graph.V];

        for (int i = 0; i < graph.V; i++) {
            d[i] = INFINTY;
            pi[i] = -1;
            S[i] = false;
        }

        d[source] = 0;
        S[source] = true;

        PriorityQueueHeap heap1 = new PriorityQueueHeap();
        for (int i = 0; i < graph.adjacencyList[source].size(); i++) {
            Edge edge1 = graph.adjacencyList[source].get(i);
            heap1.enqueue(edge1);
            d[edge1.dest] = edge1.weight;
            pi[edge1.dest] = 0;
        }

        while (heap1.length() != 0) {
            Edge u = heap1.dequeue();
            S[u.dest] = true;
            for (int i = 0; i < graph.adjacencyList[u.dest].size(); i++) {
                Edge edge2 = graph.adjacencyList[u.dest].get(i);
                if (S[edge2.dest] == false && (d[edge2.dest] > (d[edge2.src] + edge2.weight))) {
                    heap1.remove(edge2.dest);
                    d[edge2.dest] = d[edge2.src] + edge2.weight;
                    pi[edge2.dest] = u.dest;
                    heap1.enqueue(edge2);
                }
            }

        }

        // printing the solution
        for (int i = 0; i < graph.V; i++) {
            System.out.println("node --> " + i);
            System.out.println("predecessor --> " + pi[i]);
            System.out.println("weight --> " + d[i]);
            System.out.println("-----------------------------------------------");
        }
    }
}
