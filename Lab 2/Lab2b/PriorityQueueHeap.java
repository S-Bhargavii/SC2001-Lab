import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueHeap {
    PriorityQueue<Edge> priorityQueueHeap = new PriorityQueue<>(new Comparator<Edge>() {
        @Override
        public int compare(Edge edge1, Edge edge2) {
            return Integer.compare(edge1.weight, edge2.weight);
        }
    });

    // pushing edges into the priority queue
    public void enqueue(Edge edge1) {
        priorityQueueHeap.add(edge1);
    }

    // getting the minimum edge weight graph
    public Edge dequeue() {
        Edge ed1 = priorityQueueHeap.poll();
        return ed1;
    }

    public int length() {
        int size = priorityQueueHeap.size();
        // returns the number of elements in the collection
        return size;
    }

    public void remove(int dest) {
        Iterator<Edge> iterator = priorityQueueHeap.iterator();

        while (iterator.hasNext()) {
            Edge edge = iterator.next();

            if (edge.dest == dest) {
                // Use the iterator to remove the edge
                iterator.remove();
            }
        }
    }

}
