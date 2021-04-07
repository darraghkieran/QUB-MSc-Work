package collectionxamples;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class treeMapExample {

	public static void main(String[] args) {

		// Creating an empty TreeMap
		TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>();

		// Mapping string values to int keys
		tree_map.put(10, "Geeks");
		tree_map.put(15, "4");
		tree_map.put(20, "Geeks");
		tree_map.put(25, "Welcomes");
		tree_map.put(30, "You");

		// Displaying the TreeMap
		System.out.println("Initial Mappings are: " + tree_map);

		// Using entrySet() to get the set view
		System.out.println("The set is: " + tree_map.entrySet());

		// better
		System.out.println("The set is: " + tree_map);


		
		for (Integer key : tree_map.keySet()) {
			System.out.println("Key: " + key + " Map: " + tree_map.get(key));
		}
	}

}
