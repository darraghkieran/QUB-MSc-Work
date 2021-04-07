/**
 * 
 */
package queueLectures;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author DKieran
 *
 */
public class PriorityQueueExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create implementation of queue
		Queue<Double> q = new PriorityQueue<>();

		// add in any order - priotity queue uses natural ordering ie smallest to biggest == left to right
		q.add(10.1);
		q.add(3.3);
		q.add(7.3);
		q.add(20.3);
		q.add(9.3);
		q.add(1.3);
		q.add(5.2);
		System.out.println("Queue order : " + q.toString());// toString is based on heap structure, so is only useful to
															// show the contents
		int loop = 1;

		
		while (loop <= q.size()) {
			// view then remove each element by order
			System.out.println("Peek" + q.peek());// views the current top
			q.remove();//removes the current top
		}

	}

}
