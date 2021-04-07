package setsstuf;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NonDuplicatesHashSets {


		// Unlike lists, sets are unordered and can't have duplicates(eg playing cards)
		// Hashset - allows machine to get access it quickly(constant time) but has no
		// partcaular order to humans
		// Treeset - allows one to order a set

		public static void main(String[] args) {
			String[] colours = { "red", "white", "blue", "green", "gray", "orange", "tan", "white", "cyan", "peach", "gray",
					"orange" };
			List<String> list = Arrays.asList(colours);//from Array to List
			System.out.println(list.toString());

			printNonDuplicates(list);
		}

		/**
		 * 
		 * @param values
		 */
		private static void printNonDuplicates(Collection<String> values) {//from List to Collection
			
			// conversion constructor - can take anything of type collection and convert it
			Set<String> set = new HashSet<String>(values); //from Collection to set(which takes out duplicates for us)

			System.out.println("Non duplicates are : ");
			System.out.println(set.toString());

		}
}
