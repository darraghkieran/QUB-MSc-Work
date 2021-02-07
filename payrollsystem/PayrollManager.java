/**
 * 
 */
package payrollsystem;

/**
 * Represents a Payroll System
 * 
 * @author DKieran
 *
 */
public class PayrollManager {

	// instance vars
	public final static int HOURS_PER_WEEK = 35;
	public static Employee[] employees = new Employee[6];

	/**
	 * default constructor
	 */
	public PayrollManager() {

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee porter1 = new Porter("Ivana", "Patient", 10.50, "Royal");
		Employee porter2 = new Porter("Amanda", "Pushabed", 10.50, "BCH");
		Employee surgeon1 = new Surgeon("Jack", "Ripper", 55.25, "Renal", 650.00);
		Employee surgeon2 = new Surgeon("Edward", "Lister", 55.25, "Vascular", 800.00);
		Employee pharmacist1 = new Pharmacist("Poppy", "Pill", 30.50, 7, 750.00);

		addEmployeeToList(porter1);
		addEmployeeToList(porter2);
		addEmployeeToList(surgeon1);
		addEmployeeToList(surgeon2);
		addEmployeeToList(pharmacist1);

		System.out.println("-------------------------------------------------------------------------");
		displayAllEmployees(employees);
		System.out.println("-------------------------------------------------------------------------");
		processWeeklyPayroll(employees);
		System.out.println("-------------------------------------------------------------------------");

	}

	/**
	 * Iterates array of employees and adds object passed as param to null/empty
	 * elements only
	 * 
	 * @param employee
	 */
	public static void addEmployeeToList(Employee employee) {
		for (int loop = 0; loop < employees.length; loop++) {
			if (employees[loop] == null) {
				employees[loop] = employee;
				break;
			}
		}
	}

	/**
	 * Outputs hospital employee information
	 * 
	 * @param employees
	 */
	public static void displayAllEmployees(Employee[] employees) {
		System.out.println("Displaying all Employees... \nType \tFirst Name \tLastName \tRate \tOther");
		for (Employee employee : employees) {
			if (employee != null) {
				employee.printAll();
			}
		}

	}

	public static void processWeeklyPayroll(Employee[] employees) {
		System.out.println("Processing Weekly Payroll...");
		int totalEmployees = 0;
		for (Employee employee : employees) {
			if (employee != null) {
				employee.calculateWeeklySalary(HOURS_PER_WEEK);
				totalEmployees++;
			}
		}
		System.out.println("\nTotal Employees in Current Payroll: " + totalEmployees);

	}

}
