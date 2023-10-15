package PriorityqueueMinHeap;
import java.util.LinkedList;
import java.util.PriorityQueue;
  import org.w3c.dom.Node;



public class DijkstraAlgoHeap {
    
    private int v; // total number of vertex
    private int start; // source vertex

    private int[] d; // stores shortest path length
    private int[] pi; // stores vertex's prececessor
    private boolean[] s;
    private LinkedList[] graph;
    private PriorityQueue<Integer> q = new PriorityQueue<Integer>();


    public DijkstraAlgoHeap(int size, int source, LinkedList[] graph){
        v  = size;
        start = source;
        this.graph = graph;
        initalise();
        return;
    }

    private void initalise(){
        d = new int[v];
        pi = new int[v];
        s = new boolean[v];
        for(int i=0; i<v; i++)
        {
            d[i] = Integer.MAX_VALUE;
            pi[i] = -1;
            s[i] = false;
        }

        d[start - 1] = 0;
        // queue start into pq;
    }
    
    public void getPath(){
        // while loop
        // pop item from pq
        // 

        



    }
    


}

