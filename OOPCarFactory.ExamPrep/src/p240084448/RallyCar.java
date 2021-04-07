/**
 * 
 */
package p240084448;

/**
 * represents a rally car
 * @author DKieran
 *
 */
public class RallyCar extends Car {

	//instance vars
	private double area;
	
	
	//constructors
	/**
	 * 
	 */
	public RallyCar() {
		
	}

	/**
	 * @param make
	 * @param model
	 * @param horsePower
	 */
	public RallyCar(String make, String model, int horsePower, double area) {
		super(make, model, horsePower);
		this.area = area;
	}

	/**
	 * @return the area
	 */
	public double getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(double area) {
		this.area = area;
	}

	/**
	 * displays details of all instance vars in class - make, model, horsepower and
	 * area
	 */
	@Override
	public void displayAll() {
		super.displayAll();
		System.out.println("Area: " + this.area);
	}
	
	

}
