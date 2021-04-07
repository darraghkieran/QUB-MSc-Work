/**
 * 
 */
package mapsstuff;

import java.util.HashMap;
import java.util.Map;

/**
 * @author DKieran
 *
 */
public class mapsLecture {

	/**
	 * @param args
	 */
	// a map is a unique key and value pair(2d.... sets only have values)
	// unique keys & unique values - one to one mapping
	// only keys unique - many to one mapping(many keys can map to one value)

	// There are many classes that implement the Map interface = eg Hashtable,
	// HashMap) and TreeMap..... hash=for searching tree/sortedMap=for sorting

	public static void main(String[] args) {
		
		String sentence = "to be or not to be";
		// create the HashMap
		Map<String, Integer> myMap = new HashMap<>();
			//key	: Value
		
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
	}
}
