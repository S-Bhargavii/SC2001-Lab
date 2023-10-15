import java.util.Random;

public class InputGraph {
    public AdjacencyMatrixGraph adj_mat;
    public AdjacencyListGraph adj_list;

    public void CreateGraphs(int V, int E) {
        Random random = new Random();
        adj_list = new AdjacencyListGraph(V);
        adj_mat = new AdjacencyMatrixGraph(V);
        // assuming the weights of the edges to be from [1,300]
        int minwt = 1;
        int maxwt = 300;
        int weight;

        // making the distance from node A to node A = 0
        // and adding few edges explicitly just to ensure that the graph is connected
        for (int i = 0; i < V; i++) {
            // adj_mat.addEdge(i,i,0);
            // adj_list.addEdge(i, i, 0);
            if (i != V - 1) {
                weight = random.nextInt(maxwt - minwt) + minwt;
                adj_list.addEdge(i, i + 1, weight);
                adj_mat.addEdge(i, i + 1, weight);
            }
        }

        // adding the other E-(V-1) edges
        int j = 0;
        int a, b;
        while (j < (E - V + 1)) {
            a = random.nextInt(V);
            b = random.nextInt(V);
            weight = random.nextInt(maxwt - minwt) + minwt;
            if (a != b && a != (b + 1) && adj_mat.doesEdgeExist(a, b)) {
                adj_list.addEdge(a, b, weight);
                adj_mat.addEdge(a, b, weight);
                j++;
            }
        }

    }

}