package listsstuff;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 */

/**
 * @author DKieran
 *
 */
public class ListsExamples {

	public static void main(String[] args) {

		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("Belfast");
		arrList.add("Dublin");

		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("London");
		linkedList.add("Cardiff");

		showAll(arrList);
		showAll(linkedList);

	}

//	public static void showAll(ArrayList<String> arrayList) {
//        for (String city : arrayList) {
//            System.out.println(city);
//        }
//    }

//	public static void showAll(LinkedList<String> linkedList) {
//        for (String city : linkedList) {
//            System.out.println(city);
//        }
//    }

	// why not program to list interface, which can take either....

	/**
	 * Programming to the list interface
	 * 
	 * @param arrayList
	 */
	public static void showAll(List<String> cityList) {
		for (String city : cityList) {
			System.out.println(city);
		}
	}

//	/**
//	 * The highest level interface is Collection(probs wouldn't use if you needed
//	 * something more specific than just printing out to screen. 
//	 * This it could take lists, sets or queues but would only be good for something 
//	 * general eg outputting to console.
//	 * 
//	 * @param cityList
//	 */
//	public static void showAll(Collection<String> cityList) {
//		for (String city : cityList) {
//			System.out.println(city);
//		}
//	}
}
