package listsstuff;

import java.util.LinkedList;
import java.util.List;

public class Swap {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("I");
		linkedList.add("dream");
		linkedList.add("have");
		linkedList.add("a");

		// not quite right ?
		System.out.println(linkedList.toString());

		//swap dream and have
		swap(linkedList, 1, 2);
		System.out.println(linkedList.toString());
		
		//then swap dream and a
		swap(linkedList, 2, 3);
		System.out.println(linkedList.toString());

	}

	public static void swap(List<String> list, int position1, int position2) {
		String temp = list.get(position1);//put item to be swapped (position1) in a temporary holder
		list.set(position1, list.get(position2));//set the now free position1 to be position2
		list.set(position2, temp);//set the now free position2 to be whatever was in the temp holder
	}
}
