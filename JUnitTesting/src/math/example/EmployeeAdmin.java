/**
 * 
 */
package math.example;

import java.util.ArrayList;

/**
 * @author DKieran
 *
 */
public class EmployeeAdmin {
	/**
     * Searches a list of employees by age and returns all found below the specified age
     * @param employees
     * @param age
     * @return
     */
    public static ArrayList<Employee> getAllEmployeesByAge(ArrayList<Employee> employees, int age ) {
        ArrayList<Employee> employeesWithAge = new ArrayList<Employee>();
        
        for (Employee employee : employees) {
            if (employee.getAge()<=age) {
                // found an employee - adding to list
                employeesWithAge.add(employee);
            }
        }
        
        // return the list
        return employeesWithAge;
    }
}
