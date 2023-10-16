import java.util.ArrayList;
// ArrayList is a resizable array
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class PriorityQueueArr {
    private ArrayList<Edge> list = new ArrayList<>();

    // add and sort
    public void enqueue(Edge edge1) {
        int index = Collections.binarySearch(list, edge1, new EdgeComparator());
        if (index < 0) {
            index = -index - 1;
        }

        list.add(index, edge1);
    }

    // pop the minimum element
    public Integer length() {
        return list.size();
    }

    public Edge dequeue() {
        if (length() == 0) {
            return null;
        } else {
            return list.remove(0);
        }
    }

    // remove an element ( edge )
    public void remove(Edge edge1) {
        list.remove(edge1);
        System.out.println("the edge with SRC = " + edge1.src + " DESTINATION = " + edge1.dest + "WEIGHT = "
                + edge1.weight + "Has been removed");
    }

    public void remove(int dest) {
        for (int i = 0; i < length(); i++) {
            Edge e1 = list.get(i);
            if (e1.dest == dest) {
                list.remove(i);
            }
        }
    }
}

class EdgeComparator implements Comparator<Edge> {
    @Override
    public int compare(Edge e1, Edge e2) {
        return Integer.compare(e1.weight, e2.weight);
    }
}
