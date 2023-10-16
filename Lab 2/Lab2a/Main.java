public class Main {
    public static void main(String[] args) {
        // InputGraph g1 = new InputGraph();
        // AdjacencyMatrixGraph graph1;
        // graph.printGraph();
        // System.out.println();
        // System.out.println("-----------------------------------------");
        // dijkstra_arr_mat d1 = new dijkstra_arr_mat();

        // InputGraph g6 = new InputGraph();
        // AdjacencyMatrixGraph graph6;
        // dijkstra_arr_mat d6 = new dijkstra_arr_mat();
        // g6.CreateGraphs(5, 9);
        // graph6 = g6.adj_mat;
        // long startTime6 = System.nanoTime();
        // d6.ShortestPath(graph6, 0);
        // long endTime6 = System.nanoTime();
        // long elapsedTimeInMilliseconds6 = (endTime6 - startTime6);// 1_000_000; //
        // // 1,000,000 nanoseconds in a millisecond
        // System.out.println("Code execution time when V = 60 E = 90: " +
        // elapsedTimeInMilliseconds6 + " ms");
        // System.out.println("-----------------------------------------");

        // InputGraph g1 = new InputGraph();
        // AdjacencyMatrixGraph graph1;
        // dijkstra_arr_mat d1 = new dijkstra_arr_mat();
        // g1.CreateGraphs(10, 60);
        // graph1 = g1.adj_mat;
        // long startTime1 = System.nanoTime();
        // d1.ShortestPath(graph1, 0);
        // long endTime1 = System.nanoTime();
        // long elapsedTimeInMilliseconds1 = (endTime1 - startTime1);
        // System.out.println("Code execution time when V = 10 E = 60 : " +
        // elapsedTimeInMilliseconds1 + " ms");
        // System.out.println("-----------------------------------------");

        // InputGraph g2 = new InputGraph();
        // AdjacencyMatrixGraph graph2;
        // dijkstra_arr_mat d2 = new dijkstra_arr_mat();
        // g2.CreateGraphs(20, 50);
        // graph2 = g2.adj_mat;
        // long startTime2 = System.nanoTime();
        // d2.ShortestPath(graph2, 0);
        // long endTime2 = System.nanoTime();
        // long elapsedTimeInMilliseconds2 = (endTime2 - startTime2);
        // System.out.println("Code execution time when V = 20 E = 60: " +
        // elapsedTimeInMilliseconds2 + " ms");
        // System.out.println("-----------------------------------------");

        // InputGraph g3 = new InputGraph();
        // AdjacencyMatrixGraph graph3;
        // dijkstra_arr_mat d3 = new dijkstra_arr_mat();
        // g3.CreateGraphs(30, 60);
        // graph3 = g3.adj_mat;
        // long startTime3 = System.nanoTime();
        // d3.ShortestPath(graph3, 0);
        // long endTime3 = System.nanoTime();
        // long elapsedTimeInMilliseconds3 = (endTime3 - startTime3);
        // System.out.println("Code execution time when V = 30 E = 60: " +
        // elapsedTimeInMilliseconds3 + " ms");
        // System.out.println("-----------------------------------------");

        InputGraph g4 = new InputGraph();
        AdjacencyMatrixGraph graph4;
        dijkstra_arr_mat d4 = new dijkstra_arr_mat();
        g4.CreateGraphs(60, 60);
        graph4 = g4.adj_mat;
        long startTime4 = System.nanoTime();
        d4.ShortestPath(graph4, 0);
        long endTime4 = System.nanoTime();
        long elapsedTimeInMilliseconds4 = (endTime4 - startTime4);
        System.out.println("Code execution time when V = 50 E = 60: " +
                elapsedTimeInMilliseconds4 + " ms");
        System.out.println("-----------------------------------------");

        // InputGraph g5 = new InputGraph();
        // AdjacencyMatrixGraph graph5;
        // dijkstra_arr_mat d5 = new dijkstra_arr_mat();
        // g5.CreateGraphs(50, 50);
        // graph5 = g5.adj_mat;
        // long startTime5 = System.nanoTime();
        // d5.ShortestPath(graph5, 0);
        // long endTime5 = System.nanoTime();
        // long elapsedTimeInMilliseconds5 = (endTime5 - startTime5) / 1_000_000; //
        // 1,000,000 nanoseconds in a millisecond
        // System.out.println("Code execution time when V = 50 E = 50: " +
        // elapsedTimeInMilliseconds5 + " ms");
        // System.out.println("-----------------------------------------");

        // }
    }
}
