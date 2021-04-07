package collectionxamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapsLecture {

	// a map is a unique key and value pair(2d.... sets only have values)
	// unique keys & unique values - one to one mapping
	// only keys unique - many to one mapping(many keys can map to one value)

	// There are many classes that implement the Map interface = eg Hashtable,
	// HashMap) and TreeMap..... hash=for searching tree/sortedMap=for sorting

	public static void main(String[] args) {
		
		
		 ArrayList<String> cars = new ArrayList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    Collections.sort(cars);  // Sort cars
		    for (String i : cars) {
		      System.out.println(i);
		    }
		    
		    
		 // Create a HashSet object called numbers
		    Set<Integer> numbers = new HashSet<Integer>();

		    // Add values to the set
		    numbers.add(4);
		    numbers.add(7);
		    numbers.add(8);

		    // Show which numbers between 1 and 10 are in the set
		    for(int i = 1; i <= 10; i++) {
		      if(numbers.contains(i)) {
		        System.out.println(i + " was found in the set.");
		      } else {
		        System.out.println(i + " was not found in the set.");
		      }
		    }
		  
		



		    
		    
		
		
		
		
		String sentence = "to be or not to be";
		// create the HashMap
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		// tokenize the input
		String[] tokens = sentence.split(" ");
		// processing input text
		for (String token : tokens) {
			if (myMap.containsKey(token)) {
				int count = myMap.get(token); // gets the key
				// increase the count for this word
				myMap.put(token, count + 1);
			} else {
				// add new word with a count of 1 to map
				myMap.put(token, 1);
			}
		}
		System.out.println(myMap.toString());

		
		System.out.println("---------------");
		// get all key/value pairs
		System.out.println("\nMap Contains: \nKey\t\tValue");
		for (String key : myMap.keySet()) {
			System.out.printf("%-10s%10d \n",  key, myMap.get(key));
		}

		// search for a particular key/value pair
		if (myMap.containsKey("to")) {
			System.out.println("\nValue for key \"to\" : " + myMap.get("to"));
		} else {
			System.out.println("Key not found");
		}

	}

}
