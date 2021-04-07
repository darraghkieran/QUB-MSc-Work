package collectionxamples;

//Collections = a unified architecture consisting of an object/container with
// multiple
// elements that are used to store, retrieve, communicate and manipulate
// aggregate data(ie a set of organised data)
// It's a tailor made API for us to use.
// Design decisions based on the subtleties of differenet implementations will
// become increasingly important

// All collections frameworks include ......

// 1. interfaces(the API forms a hierarchy),
// 2. implementations(iw concretized implementations of the colleciton
// interfaces
// which are essentially reusable data structures, including ArrayList,
// LinkedList, HashSet, TreeSet, PrioritQueue, HashMap, TreeMap and more...) and
// 3. algorithms - polymorphic sorts and searches etc performed on objects that
// implement collection interfaces
//
// Collections interface is the least common denominator that all collections
// implement in their own way(eg, some ordered, some unordered). Allows us to
// move move a queue or set into a list through
// the conversion constructor

// List - an ORDERED collection which CAN contain duplicate elements. Gives
// precise control over where a new element is added
// 2 Conrete implementations of list - ArrayList and LinkedList
//-ArrayList  - implements List with a dynamically resizing array, allowing fast Random Read access, 
//but to add or remove from middle of list can be a problem, as making space requires a break and 
//everything to be shifted right then rejoined. With a lot of items,it could be massively
//inefficient to shift everything right of your insertion 'up'
//-LinkedList - implements List with a doubley linked list, allowing for constant time 
//insertions(the chain is simply broken once to make room. BUT you have to sequentially
//go through each element to access any one linkedList item, which you dont need to do with ArrayList as its sequential and not spread through memeory like a LinkedList is.. 
//It may just depend on the size of the list and what youre planning to do with it

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class lectureNotes {

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
//	 * something more specific than just printing out to screen. As it is, it could take lists, sets, queues etc
//	 * 
//	 * @param cityList
//	 */
//	public static void showAll(Collection<String> cityList) {
//		for (String city : cityList) {
//			System.out.println(city);
//		}
//	}
}
