import java.util.LinkedList;

public class AdjacencyListGraph {

    private LinkedList<Edge>[] adjacencyList;
    private Vertex[] vertices;
    public int V;

    public AdjacencyListGraph(int numNodes) {
        V = numNodes;
        adjacencyList = new LinkedList[numNodes];
        vertices = new Vertex[numNodes];

        for (int i = 0; i < numNodes; i++) {
            adjacencyList[i] = new LinkedList<>();
            vertices[i] = new Vertex(i);
        }
    }

    public void addEdge(int src, int dest, int weight) {
        Edge edge = new Edge(src, dest, weight);
        adjacencyList[src].add(edge);
    }

    public void printGraph() {
        for (int i = 0; i < adjacencyList.length; i++) {
            System.out.print("Vertex " + vertices[i].id + " -> ");
            for (int j = 0; j < adjacencyList[i].size(); j++) {
                Edge edge = adjacencyList[i].get(j);
                System.out.println("Vertex " + edge.dest + " , Weight: " + edge.weight);
            }
        }
    }
}
