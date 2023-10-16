public class AdjacencyMatrixGraph {

    private int[][] adjacencyMatrix;
    private Vertex[] vertices;
    public int V;

    int INFINTY = 99999999;

    public AdjacencyMatrixGraph(int numNodes) {
        adjacencyMatrix = new int[numNodes][numNodes];
        vertices = new Vertex[numNodes];
        V = numNodes;
        for (int i = 0; i < numNodes; i++) {
            vertices[i] = new Vertex(i);
            for (int j = 0; j < numNodes; j++) {
                adjacencyMatrix[i][j] = INFINTY;
            }
        }
    }

    public int getWeight(int src, int dest) {
        int wt = adjacencyMatrix[src][dest];
        return wt;
    }

    public void addEdge(int src, int dest, int weight) {
        adjacencyMatrix[src][dest] = weight;
    }

    public boolean doesEdgeExist(int src, int dest) {
        if (adjacencyMatrix[src][dest] != INFINTY) {
            return false;
        }
        return true;
    }

    public void printGraph() {
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            System.out.print("Vertex " + vertices[i].id + " -> ");
            for (int j = 0; j < adjacencyMatrix[i].length; j++) {
                int weight = adjacencyMatrix[i][j];
                if (weight > 0 && weight != INFINTY) {
                    System.out.println("Vertex " + vertices[j].id + " , Weight: " + weight);
                }
            }

        }
    }
}
