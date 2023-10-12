import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Integer[] weightOfEdges = {7, 3, 4, 8, 1, 6, 9, 2, 5, 10};
      
        //--Priority queue using min heap--

        //By default, Java's native priority queue by default uses min heap internally
        PriorityQueue<Integer> priorityQueueHeap = new PriorityQueue<Integer>();

        //Use add method to insert integers to priority queue
        for (int i = 0; i < weightOfEdges.length; i++) {
            priorityQueueHeap.add(weightOfEdges[i]);
        }

        //Use poll method to retrieve the smallest element from the queue
        //Null when no elements present in queue
        int min = priorityQueueHeap.poll();
        System.out.println(min);
    }
}
