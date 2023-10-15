package PriorityqueueMinHeap;

import java.util.LinkedList;

public class Graph {

    private LinkedList<Edge>[] adjacencyList;

    public Graph(int numNodes) {
        adjacencyList = new LinkedList[numNodes];
        for (int i = 0; i < numNodes; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int src, int dest, int weight) {
        Edge edge = new Edge(src, dest, weight);
        adjacencyList[src].add(edge);
    }

    public void printGraph() {
        for (int i = 0; i < adjacencyList.length; i++) {
            for (int j = 0; j < adjacencyList[i].size(); j++) {
                Edge edge = adjacencyList[i].get(j);
                System.out.println(i + " -> " + edge.getDest() + " Weight: " + edge.getWeight());
            }
        }
    }

    public int edgeDist(int source, int dest)
    {
        for(int i = 0 ; i  < adjacencyList[source].size(); i ++)
        {
            Edge edge = adjacencyList[source].get(i);
            if(edge.getDest() == dest)
                return edge.getWeight();
        }
        return Integer.MAX_VALUE;
    }


    public static void main(String[] args) {
        int numNodes = 3;
        Graph graph = new Graph(numNodes);
        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 2, 4);
        graph.addEdge(2, 0, 1);
        graph.printGraph();
    }
}