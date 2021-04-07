package collectionxamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class binarySearches {
	
	public static void main(String[] args) {
		
		int searchIndex = 0;
		String[] countries = { "Italy", "France", "USA", "New Zealand" };
		// Create and display a list containing the countries array elements
		List<String> list = Arrays.asList(countries); // create List

		// sort the list
		Collections.sort(list);
		System.out.println(list);
		// search for country on list
		searchIndex = Collections.binarySearch(list, "USA");
		System.out.println(searchIndex);
		// search for country not on list
		searchIndex = Collections.binarySearch(list, "England");
		System.out.println(searchIndex);
	}
}
