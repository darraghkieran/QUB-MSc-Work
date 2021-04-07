/**
 * 
 */
package comparator.stuff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author DKieran
 *
 */

public class Processor {

	public static void main(String[] args) {

		Employee e1 = new Employee("Claire", 25, "FT");
		Employee e2 = new Employee("Una", 20, "PT");
		Employee e3 = new Employee("Niamh", 40, "FT");

		Set<Employee> list = new HashSet<Employee>();// prevents duplicates
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e1);// duplicate object in the list

		// could now either change the viewAll method to accept param of type
		// Collection, so that the Set can be passed in...

		// orrr... convert the updated hashset back to a list
		List<Employee> myList = new ArrayList<Employee>(list);

		viewAll(myList);

//		Collections.sort(myList, new CompareName());
//        System.out.println("Sorted by name");
		Collections.sort(myList, new CompareName());
		System.out.println("Sorted by AGE");
		
		Collections.sort(myList, new CompareEmployStatus());
        System.out.println("By Employ status");
        viewAll(myList);

		viewAll(myList);
	}

	public static void viewAll(List<Employee> myList) {
		for (Employee e : myList) {
			System.out.println(e.toString());
		}
	}

}
