public class dijkstra_arr_mat {
    int INFINTY = 99999999;

    public void ShortestPath(AdjacencyMatrixGraph graph, int source) {

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
        PriorityQueueArr arr1 = new PriorityQueueArr();
        for (int i = 0; i < graph.V; i++) {
            if (i != source) {
                int k = graph.getWeight(source, i);
                Edge edge1 = new Edge(source, i, k);
                arr1.enqueue(edge1);
                d[i] = k;
                pi[i] = 0;
            }
        }
        while (arr1.length() != 0) {
            Edge u = arr1.dequeue();
            S[u.dest] = true; // we are relaxing u.dest ( that is the node to which the shortest distance has
                              // been found)
            for (int i = 0; i < graph.V; i++) {
                int k = graph.getWeight(u.dest, i);
                if ((i != u.dest) && (S[i] == false) && d[i] > (d[u.dest] + k)) {
                    arr1.remove(i);
                    d[i] = d[u.dest] + k;
                    pi[i] = u.dest;
                    Edge edge3 = new Edge(u.dest, i, k);
                    arr1.enqueue(edge3);
                }
            }
        }

        // printing the solution
        // for (int i = 0; i < graph.V; i++) {
        // System.out.println("node --> " + i);
        // System.out.println("predecessor --> " + pi[i]);
        // System.out.println("weight --> " + d[i]);
        // System.out.println("-----------------------------------------------");
        // }

    }
}
