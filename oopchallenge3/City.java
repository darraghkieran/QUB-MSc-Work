/**
 * 
 */
package oopchallenge3;

/**
 * @author DKieran
 *
 */
public class City {

	private String cityName;
	private int population;
	private boolean countryCapital;
	private String country;
	
	/**
	 * default constructor
	 */
	public City(){
		
	}
	
	/**
	 * @param cityName
	 * @param population
	 * @param countryCapital
	 * @param country
	 */
	public City(String cityName, int population, boolean countryCapital, String country) {
		super();
		this.cityName = cityName;
		this.population = population;
		this.countryCapital = countryCapital;
		this.country = country;
	}
	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}
	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
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
		if (population >=0 && population < 50) {
			this.population = population;
		} else {
			System.out.println("Please enter valid population - must be betwwen 0 and 50");
			this.population = 0;
		}
		
	}
	/**
	 * @return the countryCapital
	 */
	public boolean isCountryCapital() {
		return countryCapital;
	}
	/**
	 * @param countryCapital the countryCapital to set
	 */
	public void setCountryCapital(boolean countryCapital) {
		this.countryCapital = countryCapital;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", population=" + population + ", countryCapital=" + countryCapital
				+ ", country=" + country + "]";
	}
	
	
}
