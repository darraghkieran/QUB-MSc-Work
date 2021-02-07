/**
 * 
 */
package payrollsystem;

/**
 * Represents a Hospital Porter
 * 
 * @author DKieran
 *
 */
public class Porter extends Employee {

	// instance vars
	private String site;

	/**
	 * default constructor
	 */
	public Porter() {

	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 */
	public Porter(String firstName, String lastName, double baseRate, String site) {
		super(firstName, lastName, baseRate);
		this.site = site;

	}

	/**
	 * @return the site
	 */
	public String getSite() {
		return site;
	}

	/**
	 * @param site the site to set
	 */
	public void setSite(String site) {
		this.site = site;
	}

	/**
	 * Displays porter's details
	 */
	@Override
	public void printAll() {
		System.out.println("Porter\t" + this.getFirstName() + "\t\t" + this.getLastName() + "       \t"
				+ this.getBaseRate() + "\tSite: " + this.getSite());
	}

	/**
	 * Accepts hours worked as a param then outputs weekly salary for instance of
	 * employee
	 */
	@Override
	public void calculateWeeklySalary(double hours) {
		System.out.println("Porter: " + this.getFirstName() + " " + this.getLastName() + ", Site: " + this.getSite()
				+ ", Pay: " + hours + "hrs * £" + this.getBaseRate() + "= £" + (hours * this.getBaseRate()));

	}

}
