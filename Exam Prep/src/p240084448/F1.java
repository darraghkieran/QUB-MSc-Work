/**
 * 
 */
package p240084448;

/**
 * represents an F1 car
 * @author DKieran
 *
 */
public class F1 extends Car {
	//instance vars
	private double area;

	//constructors
	/**
	 * default constructor
	 */
	public F1() {
	}

	/**
	 * constructor with args
	 * @param make
	 * @param model
	 * @param horsePower
	 */
	public F1(String make, String model, int horsePower, double area) {
		super(make, model, horsePower);
		this.area = area;
	}
	
	
	//methods
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
