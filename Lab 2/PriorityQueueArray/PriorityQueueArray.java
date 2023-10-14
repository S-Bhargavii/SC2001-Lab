import java.util.ArrayList;
import java.util.Collections;

//Implementation of priority queue using traditional array
public class PriorityQueueArray {
    private ArrayList<Integer> list = new ArrayList<Integer>();

    public void enqueue(Integer edge) {
        //Perform binary search. log(n) time complexity in both the average and worst case
        int index = Collections.binarySearch(list, edge);

        /*If that particular edge is not found within the array, binary search will return
        an index that is the negative of its expected position minus one*/
        if (index < 0) {
            index = -index - 1;
        }

        list.add(index, edge);
    }

    //Use to retrieve the minimum element out of the array
    public Integer dequeue() {
        if (length() == 0) {
            return null;
        } else {
            return list.remove(0);
        }
    }

    public Integer length() {
        return list.size();
    }
}
