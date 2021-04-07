/**
 * 
 */
package p240084448;

/**
 * represents a car
 * @author DKieran
 *
 */
public class Car {
	//instance vars
	private String make;
	private String model;
	private int horsePower;
	
	//constructors
	/**
	 * default constructor
	 */
	public Car() {
		
	}
	
	/**
	 * @param make
	 * @param model
	 * @param horsePower
	 */
	public Car(String make, String model, int horsePower) {
		this.make = make;
		this.model = model;
		setHorsePower(horsePower);
	}
	
	//methods
	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}
	
	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the horsePower
	 */
	public int getHorsePower() {
		return horsePower;
	}
	/**
	 * @param horsePower the horsePower to set
	 */
	public void setHorsePower(int horsePower) {
		if (horsePower >= 0 && horsePower <= 1000) {
			this.horsePower = horsePower;
		} else {
			this.horsePower = -999;
		}
		
	}
	
	/**
	 * displays details of class
	 * @return 
	 */
	public void displayAll() {
		System.out.println("Make: " + this.make);
		System.out.println("Model: " + this.model);
		System.out.println("HorsePower: " + this.horsePower);
	}
}
