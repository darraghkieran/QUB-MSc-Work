/**
 * 
 */
package tabletshop;

/**
 * represents a tablet
 * @author DKieran
 *
 */
public class Tablet {

	private Manufacturer manufacturer;
	private String model;
	private double price;
	private boolean android;
	private double size;
	private String notes;

	/**
	 * @param manufacturer
	 * @param model
	 * @param price
	 * @param android
	 * @param size
	 * @param notes
	 */
	public Tablet(Manufacturer manufacturer, String model, double price, boolean android, double size, String notes) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.price = price;
		this.android = android;
		setSize(size);
		setNotes(notes);
	}

	

	/**
	 * @return the manufacturer
	 */
	public Manufacturer getManufacturer() {
		return manufacturer;
	}



	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
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
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the android
	 */
	public boolean isAndroid() {
		return android;
	}

	/**
	 * @param android the android to set
	 */
	public void setAndroid(boolean android) {
		this.android = android;
	}

	/**
	 * @return the size
	 */
	public double getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(double size) {
		if (size > 5 && size < 21) {
			this.size = size;
		} else {
			this.size = 999;
			System.out.println("Error - size(in inches) must be between 5 and 21");
		}

	}

	/**
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String notes) {
		if (notes.length() > 0 && notes.length() <= 250) {
			this.notes = notes;
		} else {
			System.out.println("Notes will be be truncated at 250 characters");
		}

	}

	
	public String allDetails() {
		return "Tablet Details... \nTablet manufacturer= " + manufacturer + "\nModel= " + model + "\nPrice= " + price + "\nAndroid= " + android
				+ "\nSize= " + size + "\nNotes= " + notes + "\n--------------------------------------";
	}
	
	
}
