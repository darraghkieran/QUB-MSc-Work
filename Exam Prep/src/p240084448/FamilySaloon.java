/**
 * 
 */
package p240084448;

/**
 * @author DKieran
 *
 */
public class FamilySaloon extends Car {

	// instance vars
	private boolean metalicPaint;

	/**
	 * default constructor
	 */
	public FamilySaloon() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * constructor with args
	 * 
	 * @param make
	 * @param model
	 * @param horsePower
	 */
	public FamilySaloon(String make, String model, int horsePower, boolean metalicPaint) {
		super(make, model, horsePower);
		this.metalicPaint = metalicPaint;

	}

	/**
	 * @return the metalicPaint
	 */
	public boolean isMetalicPaint() {
		return metalicPaint;
	}

	/**
	 * @param metalicPaint the metalicPaint to set
	 */
	public void setMetalicPaint(boolean metalicPaint) {
		this.metalicPaint = metalicPaint;
	}

	/**
	 * displays details of all instance vars in class - make, model, horsepower and
	 * metalicpaint
	 */
	public void displayAll() {
		System.out.println("Family Saloon\nMake: " + this.getMake() + "\nModel: " + this.getModel() + "\nHorsePower: "
				+ this.getHorsePower() + "\nMetalic Paint: " + this.isMetalicPaint());
	}
}
