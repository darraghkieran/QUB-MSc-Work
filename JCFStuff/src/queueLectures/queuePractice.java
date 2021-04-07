package queueLectures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class queuePractice {

	public static void main(String[] args) {
		
		
	List<String> list = new ArrayList<>();
	
	// populate the ArrayList with the names of six family members
	list.add("Anthony");
	list.add("Geraldine");
	list.add("Paul");
	list.add("Steven");
	list.add("James");
	list.add("Darragh");
	
	//convert list to Queue by creating a solid implementation and adding our list as an arg to the conversion constructor
//	Queue<String> myQ = new LinkedList<>(list);//if you were converting to a set it would remove duplicate items
	
	Queue<String> myQ = new PriorityQueue<>(list);//PQ uses natural order so this alphbetises output
	
	
	//add to back of queue
	myQ.add("Benny");
	
	//dequeue every 2 seconds
	while(!myQ.isEmpty()) {//while its not empty
		System.out.println(myQ.poll());//retrieve and remove item at top of q(null if nothing there)
				
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	}

}
