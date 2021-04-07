package collectionxamples;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		
        Queue<Double> q = new PriorityQueue<>();//prioities order
        // add in any order
        q.add(10.1);
        q.add(3.3);
        q.add(5.2);
        System.out.println("Order "+q.toString());//to string outputs it incorrectly based on a heap
        
        
        //views each at top of q(peek) and then removes for each iteration of the loop)
        int loop=1;
        while(loop<=q.size()){
            // view then remove by order
            System.out.println("Peeking ..."+q.peek());
            q.poll();  // similar to remove but returns null if queue is empty 
        }
    }
}
