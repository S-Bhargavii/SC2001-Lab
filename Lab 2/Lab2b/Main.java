public class Main {
    public static void main(String[] args) {

        InputGraph g4 = new InputGraph();
        AdjacencyListGraph graph4;
        dijkstra_list_heap d4 = new dijkstra_list_heap();
        g4.CreateGraphs(5, 6);
        graph4 = g4.adj_list;
        graph4.printGraph();
        System.out.println("-------------------------");
        d4.ShortestPath(graph4, 0);

    }
}
