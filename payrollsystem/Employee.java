/**
 * 
 */
package payrollsystem;

/**
 * Abstract Employee class
 * 
 * @author DKieran
 *
 */
public abstract class Employee {

	private String firstName;
	private String lastName;
	private double baseRate;

	/**
	 * default constructor
	 */
	public Employee() {

	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 */
	public Employee(String firstName, String lastName, double baseRate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.baseRate = baseRate;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the baseRate
	 */
	public double getBaseRate() {
		return baseRate;
	}

	/**
	 * @param baseRate the baseRate to set
	 */
	public void setBaseRate(double baseRate) {
		this.baseRate = baseRate;
	}

	public abstract void calculateWeeklySalary(double hours);

	/**
	 * Displays employee details
	 */
	public void printAll() {
		System.out.println(this.getFirstName() + "\t" + this.getLastName() + "\t" + this.getBaseRate());
	}
}
