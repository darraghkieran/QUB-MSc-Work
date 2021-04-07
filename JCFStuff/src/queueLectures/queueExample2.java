package queueLectures;

import java.util.LinkedList;
import java.util.Queue;

public class queueExample2 {

	public static void main(String[] args) {
		int time = 10;

		// create an implementation of a queue
		Queue<Integer> queue = new LinkedList<>();

		// populate 10 - 1
		for (int i = time; i >= 0; i--) {
			queue.add(i);
		}

		System.out.println("Queue items : " + queue.toString());

		// remove each item delaying by a second
		while (!queue.isEmpty()) {
			System.out.println(queue.remove());//remove, unlike poll which returns null, throws an exception if empty
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
