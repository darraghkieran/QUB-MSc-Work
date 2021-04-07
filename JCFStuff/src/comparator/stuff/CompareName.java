/**
 * 
 */
package comparator.stuff;

import java.util.Comparator;

/**
 * @author DKieran
 *
 */
public class CompareName implements Comparator<Employee> {

//if o1 >o2 it returns a positive so SWAP	
	@Override
	public int compare(Employee o1, Employee o2) {

//      return o1.getName().compareTo(o2.getName());
		return o1.getAge() - o2.getAge();// could swap em round and get a reverse natural order
	}
}
