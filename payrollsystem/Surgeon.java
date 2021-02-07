/**
 * 
 */
package payrollsystem;

/**
 * Represents a Surgeon
 * 
 * @author DKieran
 *
 */
public class Surgeon extends Employee {

	private String specialistArea;
	private double consultationFee;

	/**
	 * default constructor
	 */
	public Surgeon() {

	}

	/**
	 * constructor with args
	 * 
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 * @param specialistArea
	 * @param consultationfee
	 */
	public Surgeon(String firstName, String lastName, double baseRate, String specialistArea, double consultationfee) {
		super(firstName, lastName, baseRate);
		this.specialistArea = specialistArea;
		this.consultationFee = consultationfee;
	}

	/**
	 * @return the specialistArea
	 */
	public String getSpecialistArea() {
		return specialistArea;
	}

	/**
	 * @param specialistArea the specialistArea to set
	 */
	public void setSpecialistArea(String specialistArea) {
		this.specialistArea = specialistArea;
	}

	/**
	 * @return the consultationFee
	 */
	public double getConsultationFee() {
		return consultationFee;
	}

	/**
	 * @param consultationFee the consultationFee to set
	 */
	public void setConsultationFee(double consultationFee) {
		this.consultationFee = consultationFee;
	}

	/**
	 * Accepts hours worked as a param then outputs weekly salary for instance of
	 * employee
	 */
	@Override
	public void calculateWeeklySalary(double hours) {
		System.out.println("Surgeon: " + this.getFirstName() + " " + this.getLastName() + ", Specialist Area: "
				+ this.getSpecialistArea() + " Pay: " + hours + "hrs * £" + this.getBaseRate() + " + £"
				+ consultationFee + " = £" + (hours * this.getBaseRate() + consultationFee));
	}

	/**
	 * Displays surgeons's details
	 */
	@Override
	public void printAll() {
		System.out.println("Surgeon\t" + this.getFirstName() + "\t\t" + this.getLastName() + "\t\t" + this.getBaseRate()
				+ "\tSpeciality: " + this.getSpecialistArea() + ", Consultation Fee: " + this.getConsultationFee());

	}

}
