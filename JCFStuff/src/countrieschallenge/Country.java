package countrieschallenge;


/**
 * represents a country
 * 
 * @author Aidan
 *
 */
public class Country {

	private String name;
	private String region;
	private int population;
	private int area;
	private double density;

	/**
	 * Default constructor
	 */
	public Country() {

	}

	/**
	 * Creates a country with all args
	 * 
	 * @param name
	 * @param region
	 * @param population
	 * @param area
	 * @param density
	 */
	public Country(String name, String region, int population, int area, double density) {
		super();
		this.name = name;
		this.region = region;
		this.population = population;
		this.area = area;
		this.density = density;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}

	/**
	 * @param population the population to set
	 */
	public void setPopulation(int population) {
		this.population = population;
	}

	/**
	 * @return the area
	 */
	public int getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(int area) {
		this.area = area;
	}

	/**
	 * @return the density
	 */
	public double getDensity() {
		return density;
	}

	/**
	 * @param density the density to set
	 */
	public void setDensity(double density) {
		this.density = density;
	}

	/**
	 * Displays name and region
	 */
	public void displayRegionAndName() {
		System.out.println(this.region + " " + this.name);
	}

	/**
	 * Display all data to screen
	 */
	public void displayAllCountryDetails() {
		System.out.println("\nName                       \t:" + this.name);
		System.out.println("Region                     \t:" + this.region);
		System.out.println("population                 \t:" + this.population);
		System.out.println("area                       \t:" + this.area);
		System.out.printf("density                    \t:%.2f", this.density);
		System.out.println();
	}

	/**
	 * Display of name and population
	 */
	public void displayPopulationAndName() {

		System.out.println(this.population + "    \t " + this.getName());
	}

}

