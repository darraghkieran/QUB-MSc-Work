/**
 * 
 */
package payrollsystem;

/**
 * Represents a Pharmacist
 * 
 * @author DKieran
 *
 */
public class Pharmacist extends Employee {

	private int grade;
	private double bonus;

	/**
	 * default constructor
	 */
	public Pharmacist() {

	}

	/**
	 * constructor with args
	 * 
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 * @param grade
	 * @param bonus
	 */
	public Pharmacist(String firstName, String lastName, double baseRate, int grade, double bonus) {
		super(firstName, lastName, baseRate);
		this.grade = grade;
		this.bonus = bonus;

	}

	/**
	 * @return the grade
	 */
	public int getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}

	/**
	 * @return the bonus
	 */
	public double getBonus() {
		return bonus;
	}

	/**
	 * @param bonus the bonus to set
	 */
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	/**
	 * Accepts hours worked as a param then outputs weekly salary for instance of
	 * employee
	 */
	@Override
	public void calculateWeeklySalary(double hours) {
		System.out.println("Pharmacist: " + this.getFirstName() + " " + this.getLastName() + ", Grade: "
				+ this.getGrade() + ", Pay: " + hours + "hrs * £" + this.getBaseRate() + " + £" + this.getBonus()
				+ " = £" + (hours * this.getBaseRate() + bonus));
	}

	/**
	 * display's pharmacist's details
	 */
	@Override
	public void printAll() {
		System.out.println("Pharmacist " + this.getFirstName() + "\t" + this.getLastName() + "\t\t" + this.getBaseRate()
				+ "\tGrade " + this.getGrade() + ", Bonus: " + this.getBonus());
	}
}
